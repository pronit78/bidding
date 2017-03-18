package com.socialharazi.apiendpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

/**
 * Created by pronit on 18/3/17.
 */
public class BidEnd {


    @Autowired
    JmsTemplate jmsTemplate;


    public static void main(String[] args) {

    }
}
