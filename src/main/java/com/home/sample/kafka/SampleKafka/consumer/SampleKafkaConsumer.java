package com.home.sample.kafka.SampleKafka.consumer;



import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component("SampleKafkaConsumer")
public class SampleKafkaConsumer implements Processor{
	private static final Logger LOGGER = Logger.getLogger(SampleKafkaConsumer.class);
	public void process(Exchange exchange) throws Exception {
		
		LOGGER.debug("Message:::"+exchange.getIn().getBody());
		
	}

}
