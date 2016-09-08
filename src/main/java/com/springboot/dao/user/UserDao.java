package com.springboot.dao.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.mapper.user.UserMapper;
import com.springboot.model.user.User;

@Repository
public class UserDao {
	@Autowired
	private UserMapper mapper;
	
	public List<User> queryUsers(){
		return mapper.queryUser();
	}
}
