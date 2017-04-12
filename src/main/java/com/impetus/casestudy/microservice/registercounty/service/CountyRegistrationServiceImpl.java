/**
 * 
 */
package com.impetus.casestudy.microservice.registercounty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.impetus.casestudy.microservice.registercounty.County;
import com.impetus.casestudy.microservice.registercounty.dao.CountyRegistrationDao;

/**
 * @author prachi.singh
 *
 */
	@Service("countyRegistrationService")
	public class CountyRegistrationServiceImpl implements CountyRegistrationService {
		@Autowired
		CountyRegistrationDao countyRegistrationDao;

		public int create(County county) {
			return countyRegistrationDao.create(county);
		}
		@Override
		public int update(Long id, County county) {
			return countyRegistrationDao.update(id, county);
		}

		@Override
		public int delete(Long id) {
			return countyRegistrationDao.delete(id);
		}

	}