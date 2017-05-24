package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@ResponseBody	//request mapping (메소드 단독 매핑) 
	@RequestMapping("/main")	
	public String main(){
		
		
		return "MainController:main";
		
	}
	
	@ResponseBody	//메소드 단독 매핑 
	@RequestMapping("/main2/a/b/c")	
	public String main2(){
		
		
		return "MainController:main2";
		
	}
}
