package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.service.TestService;


@Controller
@RequestMapping("/Test")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("find")
	public @ResponseBody Object[] find(HttpServletRequest request){
		Object[] obj=new Object[1];
		obj[0] = testService.getTest();
		return obj;
	}
	
	@RequestMapping("find2")
	public @ResponseBody Object[] find2(HttpServletRequest request){
		Object[] obj=new Object[1];
		obj[0] = "say";
		return obj;
	}
	
}
