package com.socialharazi.suscribers;

import com.socialharazi.models.Transaction;
import org.springframework.jms.annotation.JmsListener;


/**
 * Created by pronit on 18/3/17.
 */
public class BidConsumer {



    @JmsListener(destination = "BID_TOPIC")
    public void readBid(Transaction transaction) {

    }


}
