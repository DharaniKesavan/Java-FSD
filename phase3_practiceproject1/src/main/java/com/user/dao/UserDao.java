package com.user.dao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import com.user.entity.User;

public class UserDao {
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template){
		this.template=template;
	}

	public int update(User u){
		String sql="update userdetails set name=?, age=?, country=? where userId=?";
		int ans=template.update(sql,u.getName(),u.getAge(),u.getCountry(),u.getUserId());
		return ans;
	}
	
	public User getUserId(int id){
		String sql="select * from userdetails where userId=?";
		@SuppressWarnings("deprecation")
		User u=template.queryForObject(sql,new Object[]{id},new UserMapper());		
		return u;
	}
	
	public List<User> getUsersDetails(){
		String sql="select * from userdetails";
		List<User>userList=template.query(sql,new UserMapper());
		return userList;
	}	
}
