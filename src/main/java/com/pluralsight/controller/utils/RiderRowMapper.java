package com.pluralsight.controller.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pluralsight.model.Ride;

public class RiderRowMapper implements RowMapper<Ride>{

	@Override
	public Ride mapRow(ResultSet rs, int rowNum) throws SQLException {
		Ride ride = new Ride();
		ride.setId(rs.getInt("id"));
		ride.setName(rs.getString("name"));
		ride.setDuration(rs.getInt("duration"));
		return ride;
	}

}
