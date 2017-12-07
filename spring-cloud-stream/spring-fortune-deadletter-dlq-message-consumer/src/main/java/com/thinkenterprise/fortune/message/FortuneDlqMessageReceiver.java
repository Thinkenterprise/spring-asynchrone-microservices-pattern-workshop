package com.thinkenterprise.fortune.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class FortuneDlqMessageReceiver {
	Logger logger = LoggerFactory.getLogger(FortuneDlqMessageReceiver.class);
	
	@StreamListener(FortuneDlqChannel.INPUT)
	public void receiverFortuneMessage(String message) {
		 logger.info("Dead Letter Queue Message", message);
	}
	
}
