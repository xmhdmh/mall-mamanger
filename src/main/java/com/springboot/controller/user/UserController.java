package com.springboot.controller.user;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.springboot.model.user.User;
import com.springboot.service.user.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	 @Value("${application.message}")
	  String message="hello spring boot";
	@RequestMapping("/query")
	public List<User> queryUsers(){
		 PageHelper.startPage(1,1);
		return service.queryUsers();
	}
	@RequestMapping("/test")
	public String test(Map<String,Object> model){
		 model.put("time",new Date());
	     model.put("message", message);
		return "index";
	}
}
