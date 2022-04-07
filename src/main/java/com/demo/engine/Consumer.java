package com.demo.engine;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.demo.models.User;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(User message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message.getName()+"-"+message.getAge()));
    }
}