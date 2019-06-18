package com.example.kafka.consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.kafka.consumer.bean.Employee;



@Service

public class KafkaConsumerListener
{
    
   @KafkaListener(topics = "test-topic",groupId = "test-group-id" , containerFactory= "kafkaListenerContainerFactory")
   public void consumer(Employee employee) {
      System.out.println("Consumed a new message for ::"+employee.getName());
   }
    
}
