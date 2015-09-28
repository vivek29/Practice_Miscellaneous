package com.test.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.test.spring.model.Circle;

@Aspect
public class LoggingAspect {

//	@Before("execution(public String com.test.spring.model.Circle.getName())")
		
				// Wildcard expressions (Run one advice at multiple locations)

//	@Before("execution(* get*(*))")		-- means any getter with some parameters(any)

//	@Before("execution(* get*(..))")		-- means any getter with either zero or any number of parameters
//	@Before("execution(* com.test.spring.model.Circle.get*(..))")		-- more control
	
/*
	@Before("execution(* get*())")		// means any getters and any return type for that getter
	public void LoggingAdvice(){
		System.out.println("Advice run. Get method called");
	}
*/	

/*	@Before("allGetters()")		// means any getters and any return type for that getter
	public void LoggingAdvice(){
		System.out.println("Advice run. Get method called");
	}
*/
	
/*	@Before("allGetters() && allCircleMethods()")		// means all getters of circle class
	public void LoggingAdvice(){
		System.out.println("Advice run. Get method called");
	}
*/	
	
	@Before("allCircleMethods()")					// all methods of circle
	public void LoggingAdvice(JoinPoint joinPoint){			// JoinPoint as Advice arguments
//		System.out.println(joinPoint.toString());
		System.out.println(joinPoint.getTarget());			// returns the object called
		
		Circle circle = (Circle) joinPoint.getTarget();		// can use circle object as want to..
		
	}
	
	
				// Pointcut -- run multiple advice at one single location
	
/*	@Before("execution(* get*())")		// means any getters and any return type for that getter
	public void SecondAdvice(){
		System.out.println("Second Advice run. Get method called");
	}
	
	 But here, the expression can be complex at times, so we use pointcut
*/	

	@Before("allGetters()")		// means any getters and any return type for that getter
	public void SecondAdvice(){
		System.out.println("Second Advice run. Get method called");
	}

	
	@Pointcut("execution(* get*())")
	public void allGetters() {}

/*	// POINTCUT	--  For all methods of circle class
	@Pointcut("execution(* * com.test.spring.model.Circle.*(..))")
	public void allCircleMethods() {}
*/	
/*	// POINTCUT	--  For all classes of a package
	@Pointcut("execution(* * com.test.spring.model.*)")
	public void allCircleMethods() {}
*/
	
/*	// POINTCUT	--  For a sub-package also, so it can be a class at the root package or it can be a sub-package
	@Pointcut("execution(* * com.test.spring.model..*)")		// ..(double dot) means  zero or more
	public void allCircleMethods() {}
*/
	
	// POINTCUt	-- within	-- here only one argument, i.e. the class/package
	@Pointcut("within(com.test.spring.model.Circle)")
	public void allCircleMethods() {}
	
/*	@Before("args(String)")									// no hold of value here
	public void stringArgumentMethods() {
		System.out.println("A method that takes String argument has been called");
	}
*/
	
	@Before("args(name)")									// sets the passed value to variable name or any other variable
	public void stringArgumentMethods(String name) {		// plus in Advice, specify that it is of String type
		System.out.println("A method that takes String argument has been called which is: "+name);
	}
	
/*				-- AFTER ADVICE TYPES
 * 
 	@After("args(name)")									// acts as finally
	public void stringArgumentMethods(String name) {		// i.e. no matter if execution complete successfully or not, it will run for sure.
		System.out.println("A method that takes String argument has been called which is: "+name);
	}

	@AfterReturning("args(name)")		-- runs after successful completion of setter method

	@AfterThrowing("args(name)")		-- runs if the method throws a exception
 
 */
	 
 
 	@AfterReturning(pointcut="args(name)", returning="returnString")		
	public void stringArgumentMethods(String name, String returnString) {		
		System.out.println("A method that takes String argument has been called which is: "+name + ". The output value is: "+returnString);
	}

	
/* 			-- below, it will execute for all the return type
 
 * 	@AfterReturning(pointcut="args(name)", returning="returnString")		
	public void stringArgumentMethods(String name, Object returnString) {		// Object -- means execute for any return type, whether it is String or int or anything else.	
		System.out.println("A method that takes String argument has been called which is: "+name + ". The output value is: "+returnString);
	}
*/
	
 		// SAME way for @AfterThrowing, we can also catch the exception object
 	
 	@AfterThrowing(pointcut="args(name)", throwing="ex")		
	public void exceptionAdvice(String name, RuntimeException ex) {		
 		System.out.println("An exception has been thrown.."+ex );	
 	}

 	/* 			-- below, it will execute for all types of exception
 	 * 
  	@AfterThrowing(pointcut="args(name)", throwing="ex")		
	public void exceptionAdvice(String name, Exception ex) {		// Exception
		System.out.println("An exception has been thrown.."+ex );	
 	}
 	*/

 	
//			-- @Around
/* 
 	@Around("allGetters()")
 	public void myAroundAdvice(ProceedingJoinPoint pjp) {

// 	public Object myAroundAdvice(ProceedingJoinPoint pjp) {

// Object returnvalue = null;

 		try {
 			System.out.println("Before Advice"); 			// code to run before target method
 			
			pjp.proceed();								// target method
 		//  returnvalue = pjp.proceed();
 		 
 			System.out.println("After Returning"); 			// code to run after target method
		} 
 		catch (Throwable e) {
 			System.out.println("Before Throwing"); 			
		}
 		
 		System.out.println("After Finally"); 			

//		return returnValue;
 	}
 	
 	*/
 	
 	
}

