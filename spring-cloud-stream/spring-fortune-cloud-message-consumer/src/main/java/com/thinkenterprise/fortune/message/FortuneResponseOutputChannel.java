package com.thinkenterprise.fortune.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface FortuneResponseOutputChannel {
	
	String OUTPUT = "fortuneResponseOutput";
	
	@Output(FortuneResponseOutputChannel.OUTPUT)
	MessageChannel fortuneOutput();

}
