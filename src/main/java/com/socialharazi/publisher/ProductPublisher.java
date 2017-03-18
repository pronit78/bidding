package com.socialharazi.publisher;

import com.socialharazi.models.Product;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by pronit on 19/3/17.
 */
@Component
public class ProductPublisher {


    @Autowired
    private ActiveMQTopic BidTopic;


    @Autowired
    private JmsTemplate jmsTemplate;

    public void pubProduct(Product product) {

        jmsTemplate.convertAndSend("PRODUCT_TOPIC", product);
    }
}
