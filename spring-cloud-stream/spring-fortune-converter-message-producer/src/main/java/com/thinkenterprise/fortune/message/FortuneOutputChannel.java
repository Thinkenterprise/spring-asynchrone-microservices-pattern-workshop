package com.thinkenterprise.fortune.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface FortuneOutputChannel {
	
	String OUTPUT = "fortuneOutput";
	
	@Output(FortuneOutputChannel.OUTPUT)
	MessageChannel fortuneOutput();

}
