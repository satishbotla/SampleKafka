package com.home.sample.kafka.SampleKafka.routes;

import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SampleRoutes extends RouteBuilder {
	
	@Autowired
	@Qualifier("SampleKafkaConsumer")
	Processor kafkaConsumer; 
	
	@Override
	public void configure() throws Exception {
//		from("direct:sampleKafka")
		from("kafka:localhost:9092?topic=testingkafka&groupId=testing&autoOffsetReset=earliest&consumersCount=1")
		.process(kafkaConsumer);
		
	}

}
