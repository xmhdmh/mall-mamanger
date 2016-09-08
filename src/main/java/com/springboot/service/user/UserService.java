package com.springboot.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.user.UserDao;
import com.springboot.mapper.user.UserMapper;
import com.springboot.model.user.User;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	
	public List<User> queryUsers(){
		return dao.queryUsers();
	}
}
