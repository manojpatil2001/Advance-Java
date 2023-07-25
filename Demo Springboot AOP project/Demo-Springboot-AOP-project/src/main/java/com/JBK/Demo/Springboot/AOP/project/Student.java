package com.JBK.Demo.Springboot.AOP.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
	
	@RequestMapping("testaop")
	
	String name() {
		System.out.println("i am AOP");
		return "I am AOP";
	}
	
	

}
