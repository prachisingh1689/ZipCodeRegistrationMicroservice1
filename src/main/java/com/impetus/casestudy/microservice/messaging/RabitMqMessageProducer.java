package com.impetus.casestudy.microservice.messaging;

import java.util.logging.Logger;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.impetus.casestudy.microservice.registercounty.CountyRegistrationConstants;

public class RabitMqMessageProducer {

	@Autowired
	RabbitTemplate rabbitTemplate;
	protected Logger logger = Logger.getLogger(RabitMqMessageProducer.class
			.getName());

	public void send(String messageToBeSent) {
		logger.info(CountyRegistrationConstants.RBMQ_PRODUCER_MESSAGE_INVOKE
				+ messageToBeSent);
		rabbitTemplate.convertAndSend(messageToBeSent);
		logger.info(CountyRegistrationConstants.RBMQ_PRODUCER_MESSAGE_SENT
				+ messageToBeSent);
	}
}