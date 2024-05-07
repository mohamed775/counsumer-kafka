package com.globel.system.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service

public class KafkaMessageLisntener {

	Logger log = LoggerFactory.getLogger(KafkaMessageLisntener.class);
	
	@KafkaListener(topics = "javatechie-demo" , groupId = "jt-group-1")
	public void consumer(String message) {
		log.info("consumer consume the message {} " , message);
	}
	
	@KafkaListener(topics = "javatechie-demo" , groupId = "jt-group-1")
	public void consumer2(String message) {
		log.info("consumer1 consume the message {} " , message);
	}
	
	@KafkaListener(topics = "javatechie-demo" , groupId = "jt-group-1")
	public void consumer3(String message) {
		log.info("consumer2 consume the message {} " , message);
	}
}
