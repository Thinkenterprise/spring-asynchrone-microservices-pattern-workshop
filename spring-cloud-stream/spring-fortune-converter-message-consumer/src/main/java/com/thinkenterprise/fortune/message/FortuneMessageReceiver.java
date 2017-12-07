package com.thinkenterprise.fortune.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.thinkenterprise.fortune.Fortune;

@Component
public class FortuneMessageReceiver {
	Logger logger = LoggerFactory.getLogger(FortuneMessageReceiver.class);
	
	
	@StreamListener(FortuneInputChannel.INPUT)
	public void receiverFortuneMessage(Fortune message) {
		 logger.info(message.getText());
	}
	
}
