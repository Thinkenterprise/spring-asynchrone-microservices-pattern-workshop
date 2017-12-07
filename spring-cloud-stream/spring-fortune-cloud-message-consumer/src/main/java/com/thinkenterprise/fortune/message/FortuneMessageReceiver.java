package com.thinkenterprise.fortune.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import com.thinkenterprise.fortune.Fortune;
import com.thinkenterprise.fortune.FortuneRepository;

@Component
public class FortuneMessageReceiver {
	Logger logger = LoggerFactory.getLogger(FortuneMessageReceiver.class);
	
	@Autowired
	FortuneRepository fortuneRepository;
	
	@StreamListener(value=FortuneInputChannel.INPUT)
	@SendTo(value=FortuneResponseOutputChannel.OUTPUT)
	public Fortune receiverFortuneMessage(String message) {
		return fortuneRepository.randomFortunes().iterator().next();
	}
}