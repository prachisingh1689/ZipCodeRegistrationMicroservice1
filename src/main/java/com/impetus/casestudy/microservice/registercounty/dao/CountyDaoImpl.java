package com.impetus.casestudy.microservice.registercounty.dao;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.impetus.casestudy.microservice.registercounty.County;

/**
 * @author prachi.singh
 *
 */
@Repository("countyDAO")
@PropertySource("classpath:sql.properties")
public class CountyDaoImpl implements CountyRegistrationDao {
		@Autowired
		JdbcTemplate jdbcTemplate;

		@Value("${createcounty}")
		private String CREATECOUNTY_QUERY;

		@Value("${updatecounty}")
		private String UPDATECOUNTY_QUERY;

		@Value("${deletecounty}")
		private String DELETECOUNTY_QUERY;

		protected Logger logger = Logger.getLogger(CountyDaoImpl.class.getName());


		@Override
		public int create(County county) {
			return jdbcTemplate.update(
					CREATECOUNTY_QUERY,
					new Object[]{county.getZipCode(), county.getCountyName()});
		}

		@Override
		public int update(Long id, County county) {
			return jdbcTemplate.update(UPDATECOUNTY_QUERY, county.getZipCode(),
					county.getCountyName(), id);
		}

		@Override
		public int delete(Long countyId) {
			return jdbcTemplate.update(DELETECOUNTY_QUERY, countyId);
		}
	}
