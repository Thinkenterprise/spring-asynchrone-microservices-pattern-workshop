/*
 * Copyright (C) 2016 Thinkenterprise
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * @author Michael Schaefer
 */

package com.thinkenterprise;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.thinkenterprise.fortune.Fortune;
import com.thinkenterprise.fortune.FortuneRepository;
import com.thinkenterprise.fortune.message.FortuneOutputChannel;

@SpringBootApplication

public class FortuneMessageSenderApplication {

	@Autowired
	private FortuneOutputChannel fortuneOutputChannel;
	
	@Autowired
	FortuneRepository fortuneRepository;
	
	
    public static void main(String[] args) {
        SpringApplication.run(FortuneMessageSenderApplication.class, args);
    }
    
    
    
}
