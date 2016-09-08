package com.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/home")
	public String main(){
		return "home";
	}
	
	@RequestMapping("/sort")
	public String sort(){
		return "/picture/adsSort";
	}
}
