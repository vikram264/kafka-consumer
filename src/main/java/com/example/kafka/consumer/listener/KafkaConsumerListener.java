package com.example.kafka.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.kafka.consumer.bean.Employee;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumerListener
{
    // Using topic patter -- to dynamic topic listening instead of just a group
    // of topics
    @KafkaListener(topicPattern = "test.*", groupId = "test-json-id",
        containerFactory = "kafkaListenerContainerFactory")
    public void consumer (Employee employee)
    {
        log.info("Consumed a new message for {}", employee.getName());
    }

}
