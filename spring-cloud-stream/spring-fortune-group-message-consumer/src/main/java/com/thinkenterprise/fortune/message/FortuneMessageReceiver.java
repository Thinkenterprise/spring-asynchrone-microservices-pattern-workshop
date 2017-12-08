package com.thinkenterprise.fortune.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class FortuneMessageReceiver {
	Logger logger = LoggerFactory.getLogger(FortuneMessageReceiver.class);
	
	@StreamListener(FortuneInputChannel.INPUT)
	public void receiverFortuneMessage(String message) {
		 logger.info(message);
	}
	
}
