package com.impetus.casestudy.microservice.registercounty;

import java.util.logging.Logger;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.impetus.casestudy.microservice.messaging.RabitMqMessageProducer;
import com.impetus.casestudy.microservice.registercounty.service.CountyRegistrationService;

/**
 * @author prachi.singh
 *
 */

@RestController
public class CountyRegistrationRestController {
		@Autowired
		CountyRegistrationService countyRegistrationService;
		@Autowired
		RabitMqMessageProducer rabbMessageProducer;

		protected Logger logger = Logger
				.getLogger(CountyRegistrationRestController.class.getName());

		@PostMapping(value = "/county", produces = MediaType.APPLICATION_JSON)
		public void createCounty(@RequestBody County county) {
		//public ResponseEntity<County> createCounty(@RequestBody County county) {
			logger.info("CountyRestController createCounty() invoked: " + county);
			int status = countyRegistrationService.create(county);
			/*if (status == 1) {
				rabbMessageProducer
						.send(CountyRegistrationConstants.RBMQ_USER_REGISTRATION_MESSAGE
								+ county);
				return new ResponseEntity<County>(county, HttpStatus.OK);
			} else {
				return new ResponseEntity<County>(county, HttpStatus.BAD_REQUEST);
			}*/
		}

		@DeleteMapping("/county/{id}")
		public ResponseEntity<Long> deleteCounty(@PathVariable Long id) {

			if (0 == countyRegistrationService.delete(id)) {
				return new ResponseEntity(CountyRegistrationConstants.NOUSERFOUND
						+ id, HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<Long>(id, HttpStatus.OK);
		}

		@PutMapping("/county/{id}")
		public ResponseEntity<County> updateCounty(@PathVariable Long id,
				@RequestBody County county) {

			int result = countyRegistrationService.update(id, county);

			if (0 == result) {
				return new ResponseEntity(CountyRegistrationConstants.INCORRECT_ID
						+ id, HttpStatus.NOT_FOUND);
			}

			return new ResponseEntity<County>(county, HttpStatus.OK);
		}

/*		@GetMapping("/county/test")
		public ResponseEntity testMessaging() {
			rabbMessageProducer.send(CountyRegistrationConstants.RBMQ_TEST_MESSAGE);
			return null;
		}*/
	}