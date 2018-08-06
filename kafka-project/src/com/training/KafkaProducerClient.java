package com.training;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import kafka.producer.Producer;

public class KafkaProducerClient {

	public static void main(String[] args) {

		Properties properties = new Properties();

		properties.setProperty("bootstrap.servers", "localhost:9092");
		properties.setProperty("key.serializer", StringSerializer.class.getName());
		properties.setProperty("value.serializer", StringSerializer.class.getName());

		properties.setProperty("acks", "1");
		properties.setProperty("retries", "3");

		org.apache.kafka.clients.producer.Producer<String, String> producer = new KafkaProducer<String, String>(
				properties);
		
		for(int i=0;i<10;i++) {

		ProducerRecord<String, String> producerRecord = new ProducerRecord<String, String>("topicA", "1",
				"Testing producer from java=>"+i);
		System.out.println("Message Sent"+i);
		producer.send(producerRecord);
		}
		producer.flush();
		producer.close();
		System.out.println("Message Sent");

	}

}
