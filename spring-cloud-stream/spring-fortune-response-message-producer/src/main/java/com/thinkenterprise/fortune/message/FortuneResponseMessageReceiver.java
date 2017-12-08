package com.thinkenterprise.fortune.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import com.thinkenterprise.fortune.Fortune;

@Component
public class FortuneResponseMessageReceiver {
	Logger logger = LoggerFactory.getLogger(FortuneResponseMessageReceiver.class);
	
	@StreamListener(value=FortuneResponseInputChannel.INPUT)
	public void receiverFortuneMessage(String message) {
		 logger.info("Incomming Response " + message );
		 
	}
}