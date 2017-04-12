package com.impetus.casestudy.microservice.registercounty.dao;

import com.impetus.casestudy.microservice.registercounty.County;

/**
 * @author prachi.singh
 *
 */
public interface CountyRegistrationDao {

	public abstract int create(County county);

	public abstract int update(Long id, County county);

	public abstract int delete(Long id);
}
