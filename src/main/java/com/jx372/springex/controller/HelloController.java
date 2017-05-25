package com.jx372.springex.controller;


import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {
	
	
	@RequestMapping( "/hello" )
	public String hello(){
		
		
		return "/WEB-INF/view/Hello.jsp";
		
	}
	
	
	@RequestMapping( "/hello2" )
	public ModelAndView hello2(@RequestParam("n") String name){
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", name);
		mav.setViewName( "/WEB-INF/view/Hello.jsp" );

		return  mav;
		
	}
	
	

	@RequestMapping( "/hello3" )
	public String hello3(
		Model model,	
		@RequestParam("n") String name){
		
		model.addAttribute("name", name);

		return "/WEB-INF/view/Hello.jsp";
		
	}
	
	
	/*//기술이 침투되어있어서 쓰지 않는 방식 
	@RequestMapping( "/hello3" )
	public void hello3( HttpServletRequest request, Writer out){
		
		String name = request.getParameter("name");
		try {
			out.write("<h1>hello"+name+"</h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	*/
}
