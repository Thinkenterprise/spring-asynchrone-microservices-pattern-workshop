package com.thinkenterprise.fortune.message;


import java.util.Random;
import java.util.RandomAccess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class FortuneMessageReceiver {
	Logger logger = LoggerFactory.getLogger(FortuneMessageReceiver.class);
	
	
	@StreamListener(value=FortuneInputChannel.INPUT)
	public void receiverFortuneMessage(String message) {
		
		if(new Random().nextBoolean()==true)
			 logger.info("receive  " + message);
		else 
			throw new FortuneMessageException("Message Rejected");
	}
}