package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	
	// request mapping (type 단독 매핑
	
	@ResponseBody
	@RequestMapping //메소드 이름으로 매핑해줌, 명시적으로 적어주는것이 좋음 
	public String list(){
		
		return "GuestbookController:list()";
		
	}
	

}
