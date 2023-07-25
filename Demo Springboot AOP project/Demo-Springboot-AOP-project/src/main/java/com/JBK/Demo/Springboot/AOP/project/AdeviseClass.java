package com.JBK.Demo.Springboot.AOP.project;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Controller;

@Aspect
@Controller
public class AdeviseClass {
	                        // package name                //classname  //method name 
	@Before("execution(* com.JBK.Demo.Springboot.AOP.project.Student.name())")
	void msg1() {
		System.out.println("hiiiiiii");
	}
	
	@After("execution(* com.JBK.Demo.Springboot.AOP.project.Student.name())")
	void msg2() {
		System.out.println("helloooooooooo");
	}
	
	@Around("execution(* com.JBK.Demo.Springboot.AOP.project.Student.msg1())")
	void msg3() {
		System.out.println("helloo and hiiii");
	
	}
	
}
 