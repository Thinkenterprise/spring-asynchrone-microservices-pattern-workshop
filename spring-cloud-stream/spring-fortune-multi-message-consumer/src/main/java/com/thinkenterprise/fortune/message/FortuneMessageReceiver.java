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
	
	
	@StreamListener(condition= "headers['content-type']=='application/json'", value=FortuneInputChannel.JSON_INPUT)
	//@StreamListener(FortuneInputChannel.JSON_INPUT)
	public void receiverFortuneMessage(Fortune message) {
		 logger.info("receive applicatio/jason" + message.getText());
	}
	
	
	@StreamListener(condition= "headers['content-type']=='text/plain'", value=FortuneInputChannel.STIRNG_INPUT )
	//@StreamListener(FortuneInputChannel.STIRNG_INPUT )
	public void receiverFortuneMessage(String message) {
		 logger.info("receive plain/text" + message);
	}
}