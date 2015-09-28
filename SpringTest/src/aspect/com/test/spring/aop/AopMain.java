package com.test.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.spring.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aspect.xml");
		ShapeService ss = context.getBean("shapeService", ShapeService.class);
		
		// Before calling this set method, call goes to the @Before("args(String)") annotation
		// bcoz it takes exactly one String parameter.
		
//		ss.getCircle().setName("Dummy Circle Name"); 		// sets the name of circle

		ss.getCircle().setNameandReturn("Dummy Circle Name100");
		
		System.out.println(ss.getCircle().getName());
//		System.out.println(ss.getTriangle().getName());
				
	}

}