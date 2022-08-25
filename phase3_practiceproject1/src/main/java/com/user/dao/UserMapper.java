package com.user.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.user.entity.User;

public class UserMapper implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum)throws SQLException{
		User user =new User();
		user.setUserId(rs.getInt("userId"));
		user.setName(rs.getString("name"));
		user.setAge(rs.getString("age"));
		user.setCountry(rs.getString("country"));
		return user;
	}	
}