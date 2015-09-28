package com.practice.vivek;

public class useofstatic {

	
	      String output = ""; 
	      int a=0;
	      static int b=1;	      
	      
	      public useofstatic(){					// constructors cann't be static..!!
	            output = "Hello World";
	      } 

	      public String printMessage(){
	            return output;
	      } 

	      public int test(){				// if want to return a, than it cann't be static.
	   
	    	  return a;
	      }
	      
	      public static void test1(){				// static method
	    	  
	    	//  return b;
	    	  System.out.println(b);
	      }
	      
	      public static void main (String args[])
	      { 
	            useofstatic obj = new useofstatic();  
	            System.out.println(obj.printMessage());
	            System.out.println(obj.a);					// without static through object
	  
	            System.out.println(b);						// static, so can be called directly.
	      
	            
	            System.out.println(obj.test());		// not static so called using object.
	            
   //         System.out.println(useofstatic.test1());	
	            									// using a static method directly thru class
            				// OR,
	           test1(); 
            // and print in test1() method itself
	      }

	}
	