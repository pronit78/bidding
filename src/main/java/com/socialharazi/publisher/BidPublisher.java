package com.socialharazi.publisher;

import com.socialharazi.models.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by pronit on 19/3/17.
 */
@Component
public class BidPublisher {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void bidPublish(Transaction transaction){

    }

}
