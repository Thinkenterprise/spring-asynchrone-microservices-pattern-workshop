package com.thinkenterprise.fortune.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface FortuneReceiverChannel {
	
	String INPUT = "fortuneInput";

	@Input(FortuneReceiverChannel.INPUT)
	SubscribableChannel fortuneInput();

}
