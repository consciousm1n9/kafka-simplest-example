package com.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.engine.Producer;
import com.demo.models.User;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;

    @Autowired
    KafkaController(Producer producer) {
        this.producer = producer;
    }

    //Simplest kafka example. Kafka+zookeeper
    @PostMapping(value = "/first")
    public void firstExample(@RequestParam("name") String name, @RequestParam("age") int age) {
    	User message = new User(name, age);
        this.producer.sendMessage(message);
    }
    
    //Kafka+zookeeper+avro
    @PostMapping(value = "/second")
    public void secondExample(@RequestParam("name") String name, @RequestParam("age") int age) {
    	User message = new User(name, age);
        this.producer.sendMessage(message);
    }
}