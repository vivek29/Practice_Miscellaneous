package com.test.spring.SpringTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
/*		AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
		context1.registerShutdownHook();
*/		
		/*Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();*/
		
//		Shape shape = (Shape) context.getBean("triangle");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();

		// print message from main.. read message from properties file -- use messageSource
		System.out.println(context.getMessage("greeting", null, "Default greeting from Main", null));
		
	}

}
