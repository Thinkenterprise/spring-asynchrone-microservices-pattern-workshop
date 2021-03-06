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
package com.thinkenterprise.fortune.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkenterprise.fortune.Fortune;
import com.thinkenterprise.fortune.FortuneRepository;

@RestController
@RequestMapping("message")
public class FortuneMessageProducerController {
	
	Logger logger = LoggerFactory.getLogger(FortuneMessageProducerController.class);
	
	@Autowired
	FortuneOutputChannel fortuneOutputStream;
		
	@Autowired
	FortuneRepository fortuneRepository;

	@RequestMapping("/sendRandom")
	public String fortune() {
		
		Iterable<Fortune> result = fortuneRepository.randomFortunes();
						
		if(fortuneOutputStream.fortuneOutput().send(MessageBuilder.withPayload(result.iterator().next()).build()))
			return "send message with fortune string";
		else			
			return "send message with fortune string error";  
		
	}

}
