package com.impetus.casestudy.microservice.registercounty.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.impetus.casestudy.microservice.registercounty.County;
import com.impetus.casestudy.microservice.registercounty.CountyRegistrationConstants;

public class CountyRowMapper implements RowMapper {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		County county = new County();
		county.setId(rs.getLong(CountyRegistrationConstants.COUNTY_ID));
		county.setZipCode(rs.getString(CountyRegistrationConstants.ZIPCODE));
		county.setCountyName(rs.getString(CountyRegistrationConstants.COUNTY_NAME));
		return county;
	}

}

