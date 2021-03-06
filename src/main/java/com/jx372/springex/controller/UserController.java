package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user")
public class UserController {
	 
	//request mapping (type+ method) 
	
	@ResponseBody
	@RequestMapping("/joinform")
	public String joinform(){
		
		return "UserController:joinform";
		
	}
	
	@ResponseBody
	@RequestMapping({"/join","/dojoin"})
	public String doJoin(){
		
		return "UserController:doJoin";
		
	}
	

	@RequestMapping(value="/login", method=RequestMethod.GET) //2개이상의 값을 줄때 value로 지정해줘야함 , get방식으로 들어오면 실행하세요
	public String login(){
		
		return "/WEB-INF/view/login.jsp";
	}
	
	/*
	@ResponseBody
	@RequestMapping(value="/login", method=RequestMethod.POST) //2개이상의 값을 줄때 value로 지정해줘야함 , post방식으로 들어오면 실행하세요
	public String login(@ModelAttribute UserVo userVo){ //같은 메소드라도 가능함 , url을 다르게 할 필요가 없음, uservo 이름과 jsp 이름이 같아야한다. setter도 있어야함 !!
		
		//@RequestParam(value="email",required=true, defaultValue="") String email, 값이 여러개일경우  modelattribute를 써서 한꺼번에 가지고 온다. 
		
		
		System.out.println(userVo);
		
		return "UserController:login(String, String)";
	*/	
		

		@RequestMapping(value="/login", method=RequestMethod.POST) //2개이상의 값을 줄때 value로 지정해줘야함 , post방식으로 들어오면 실행하세요
		public String login(@ModelAttribute UserVo userVo){ //같은 메소드라도 가능함 , url을 다르게 할 필요가 없음, uservo 이름과 jsp 이름이 같아야한다. setter도 있어야함 !!
			
			//@RequestParam(value="email",required=true, defaultValue="") String email, 값이 여러개일경우  modelattribute를 써서 한꺼번에 가지고 온다. 
			
			
			System.out.println(userVo);
			
			return "redirect:/main";  //contextpath를 적어주면 안됨 , 기술적인 요소는 dispathservlet이 알아서 해주기때문에
			
			
			
		
	}

}
