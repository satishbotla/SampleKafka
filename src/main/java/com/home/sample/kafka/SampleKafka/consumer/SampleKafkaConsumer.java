package com.home.sample.kafka.SampleKafka.consumer;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component("SampleKafkaConsumer")
public class SampleKafkaConsumer implements Processor{

	public void process(Exchange exchange) throws Exception {
		
		System.out.println("Message:::"+exchange.getIn().getBody());
		
	}

}
