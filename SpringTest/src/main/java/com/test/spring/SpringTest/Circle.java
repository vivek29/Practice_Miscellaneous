package com.test.spring.SpringTest;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component		// -- Generic
// Other Stereotypes (specific role+level of documentation+other adv.)
//@Service		-- A Service layer class(bean)
//@Repository	-- A Data object(bean)
//@Controller   -- A Controller bean

@Controller
public class Circle implements Shape {

	private Point center;
	
	public Point getCenter() {
		return center;
	}
	
	@Autowired				// autowire memeber variable messageSource by type(ResourceBundleMessageSource)
							// bean id is "messageSource", so instance of that bean is used in Circle class.
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	//	@Required							// tells spring that this member variable is required(no dependency wiring using required).
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	// This draw method has hard coded text here.
/*	public void draw() {
		System.out.println("Drawing circle");
		System.out.println("Circle's center is: ("+center.getX()+", "+center.getY()+")");
		
		// print message from a bean.. read message from properties file -- use messageSource
		System.out.println(this.messageSource.getMessage("greeting", null, "Default greeting from Main", null));
	}
*/	
	
	// This draw method reads text from a property file
	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default drawing", null));
		System.out.println(this.messageSource.getMessage("drawing.center", new Object[] {center.getX(), center.getY()}, "Default center", null));
	
	}
	
}
