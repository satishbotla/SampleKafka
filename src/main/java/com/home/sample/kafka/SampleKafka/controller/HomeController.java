package com.home.sample.kafka.SampleKafka.controller;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired
	ProducerTemplate producerTemplate;
	
	@RequestMapping(value = "/")
	public String home(){
		return "WELCOME";
		
	}
	
	@RequestMapping(value = "/send")
	public void sendMessage(){
		producerTemplate.sendBody("direct:sampleKafka", "SENDING MESSAGE WITH THIS CONTENT");
	}

}
