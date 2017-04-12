package com.impetus.casestudy.microservice.messaging;

import java.util.logging.Logger;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import com.impetus.casestudy.microservice.registercounty.CountyRegistrationConstants;

public class RabitMqMessageConsumer implements MessageListener {
	protected Logger logger = Logger.getLogger(RabitMqMessageConsumer.class
			.getName());

	@Override
	public void onMessage(Message message) {

		logger.info(CountyRegistrationConstants.RBMQ_CONSUMER_MESSAGE_RECEIVED
				+ message.getBody());
	}
}