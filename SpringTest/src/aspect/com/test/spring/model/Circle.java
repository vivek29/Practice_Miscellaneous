package com.test.spring.model;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Inside circle's setter method");
//		throw(new RuntimeException());			-- for @AfterThrowing
	}

	public String setNameandReturn(String name) {				//	a method which returns String-- @AfterReturning
		this.name = name;
		System.out.println("Inside circle's setter method");
		return name;
	}
	
	
}
