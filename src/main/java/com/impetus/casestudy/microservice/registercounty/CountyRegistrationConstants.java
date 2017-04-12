package com.impetus.casestudy.microservice.registercounty;

public class CountyRegistrationConstants {

	public static final String COUNTY_NAME = "COUNTY_NAME";
	public static final String ZIPCODE = "ZIPCODE";
	public static final String COUNTY_ID = "COUNTY_ID";
	public static final String SIMPLE_MESSAGE_QUEUE = "casestudy.usermanagement.rabbitmq.queue";
	public static final String LOCALHOSTURL = "localhost";
	public static final String RABITMQUSERNAME = "guest";
	public static final String RABITMQPASSWORD = "guest";
	public static final String SERVICE_RESPONSE_TYPE = "application/json";
	public static final String NOUSERFOUND = "No User found for ID ";
	public static final String INCORRECT_ID = "Either county/zip Not Found or Incorrect Input Provided for : ";
	public static final String RBMQ_TEST_MESSAGE = "Test message from County Service..";
	public static final String RBMQ_USER_REGISTRATION_MESSAGE = "County registered sucessfully: ";
	public static final String RBMQ_PRODUCER_MESSAGE_INVOKE = "RabitMqMessageProducer send() invoked for sending message:";
	public static final String RBMQ_PRODUCER_MESSAGE_SENT = "RabitMqMessageProducer sent message successfully.. ";
	public static final String RBMQ_CONSUMER_MESSAGE_RECEIVED = "RabitMqMessageConsumer received message successfully: ";
	public static final String USER_REGISTRATION_SERVICE_URL = "http://localhost:2223/county/";
	public static final String USER_REGISTRATION_SERVICE_DELETE_URL = "http://localhost:2223/county/1";

}
