/**
 * 
 */
package com.impetus.casestudy.microservice.registercounty.service;

import com.impetus.casestudy.microservice.registercounty.County;

/**
 * @author prachi.singh
 *
 */
public interface CountyRegistrationService {

		public abstract int create(County county);

		public abstract int update(Long id, County county);

		public abstract int delete(Long id);
	}
