package com.JBK.Demo.Springboot.AOP.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class DemoSpringbootAopProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootAopProjectApplication.class, args);
		
		System.out.println("Springboot AOP(Aspect Oriented Concept) running.........");
	}

}
