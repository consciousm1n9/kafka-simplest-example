package com.demo.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
//import org.apache.kafka.common.serialization.ByteArraySerializer;

import com.demo.models.User;

@Service
public class Producer {

    private static final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "users";

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessage(User message) {
        logger.info(String.format("#### -> Producing message -> %s", message));
        this.kafkaTemplate.send(TOPIC, message);
    }
}