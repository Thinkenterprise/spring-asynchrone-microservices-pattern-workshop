package com.thinkenterprise.fortune.stream;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class FortuneMessageReceiver {
	
	@StreamListener(FortuneInputChannel.INPUT)
	public void receiverFortuneMessage(String message) {
		System.out.println(message);
	}
	
	

}
