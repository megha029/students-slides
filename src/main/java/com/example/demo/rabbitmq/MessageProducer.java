package com.example.demo.rabbitmq;

import java.util.List;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.example.demo.model.Transaction;



@Component
	public class MessageProducer {   

	  private final RabbitTemplate rabbitTemplate;  

	  

	  @Autowired
	  public MessageProducer(RabbitTemplate template) {

	      this.rabbitTemplate = template;

	  }

	  

	
	  @Bean
	  public Queue queue() {

	      return new Queue("spring-boot-megha", false);

	  }

	  public void sendMessage(List<Transaction> transactionmessage) {       

	    rabbitTemplate.convertAndSend("spring-boot-megha", transactionmessage.toString());   

	  }

	}



