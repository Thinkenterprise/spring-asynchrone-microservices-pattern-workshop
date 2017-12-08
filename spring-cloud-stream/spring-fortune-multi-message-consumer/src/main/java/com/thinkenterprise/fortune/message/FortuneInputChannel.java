package com.thinkenterprise.fortune.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface FortuneInputChannel {
	
	String JSON_INPUT = "JsonFortuneInput";
	String STIRNG_INPUT = "StringFortuneInput";
	

	@Input(FortuneInputChannel.JSON_INPUT)
	SubscribableChannel JsonFortuneInput();
	

	@Input(FortuneInputChannel.STIRNG_INPUT)
	SubscribableChannel StringFortuneInput();
	
	

}
