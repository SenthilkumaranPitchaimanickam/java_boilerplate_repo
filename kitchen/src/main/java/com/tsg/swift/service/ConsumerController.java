package com.tsg.swift.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;



@Service
public class ConsumerController {
	
	  @KafkaListener(topics = "Kafka_Topic", groupId = "group_id")
	    public void consume(String message) {
	        System.out.println("Consumed message: " + message);
	    }

}
