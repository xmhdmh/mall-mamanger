package com.mall.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sysDic")
public class SysDicController {

	@RequestMapping("/query")
	public String query(){
		return "/system/dictionary/main";
	}
}
