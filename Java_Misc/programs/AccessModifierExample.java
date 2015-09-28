package com.practice.vivek;

class BaseClass {											// no access modifier here

	public int x = 10;
	private int y = 10;
	protected int z = 10;
	
	int a = 10; //Implicit Default Access Modifier
	
	public void setX(int x) {
		this.x = x;
	}
	
	private void setY(int y) {					// private method and data
		this.y = y;								// so cann't be used in derived/main class
	}
	
	protected void setZ(int z) {
		this.z = z;
	}
	
	void setA(int a) {
		this.a = a;
	}
}


public class AccessModifierExample extends BaseClass {

	public static void main(String args[]) {
		
		BaseClass rr = new BaseClass();
		
		rr.z = 0;
		
		AccessModifierExample subClassObj = new AccessModifierExample();

		//Access Modifiers - Public
		System.out.println("Value of x is : " + subClassObj.x);
		subClassObj.setX(20);
		System.out.println("Value of x is : " + subClassObj.x);

		//Access Modifiers - Public
		//    	If we remove the comments it would result in a compilaton
		//    	error as the fields and methods being accessed are private
		/*    	System.out.println("Value of y is : "+subClassObj.y);

		 subClassObj.setY(20);

		 System.out.println("Value of y is : "+subClassObj.y);*/
		
		//Access Modifiers - Protected
		System.out.println("Value of z is : " + subClassObj.z);
		subClassObj.setZ(30);
		System.out.println("Value of z is : " + subClassObj.z);

		//Access Modifiers - Default
		System.out.println("Value of a is : " + subClassObj.a);
		subClassObj.setA(20);
		System.out.println("Value of a is : " + subClassObj.a);
	
	}
}

