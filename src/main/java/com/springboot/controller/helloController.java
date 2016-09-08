package com.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class helloController {

	@RequestMapping("/hello/{id}")
	@ResponseBody
	public String sayHello(@PathVariable int id){
		return "ÄãºÃ°¡£¡"+id;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(helloController.class, args);
		//Map<String, Object> map=new HashMap<String, Object>(16);
		//System.out.println(map.size());
	}
}
