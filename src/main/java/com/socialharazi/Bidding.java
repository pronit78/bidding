package com.socialharazi;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;


@SpringBootApplication
@EnableJms
public class Bidding {


	@Autowired

	public static void main(String[] args) {
		SpringApplication.run(Bidding.class, args);
	}



	@Bean
	public ActiveMQTopic BidTopic() {
		return new ActiveMQTopic("BID_TOPIC");
	}


	@Bean
	public ActiveMQTopic ProductTopic() {
		return new ActiveMQTopic("PRODUCT_TOPIC");
	}
}
