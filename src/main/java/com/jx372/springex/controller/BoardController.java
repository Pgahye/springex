package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	
	@ResponseBody
	@RequestMapping("/write")
	public String write(
			//@RequestParam("n") String name
			@RequestParam(value="n",required=true, defaultValue="") String name, //default값 주는 방법
			@RequestParam(value="age",required=true, defaultValue="10") int age //변수타입 String 안해도 됨 
			){
		
		System.out.println(name+"  "+age);
		
		return "BoardController: write";
	}
	
	

	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam String name){ //위처럼 명시적으로 써주는 것이 좋음 
		
		System.out.println(name);
		
		return "BoardController: update";
	}
	
	

}
