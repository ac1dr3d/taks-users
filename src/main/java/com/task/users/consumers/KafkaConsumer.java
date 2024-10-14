package com.task.users.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "order_topic", groupId = "task-group")
    public void consume(String message) {
        System.out.println("Message received: " + message);
    }
}
