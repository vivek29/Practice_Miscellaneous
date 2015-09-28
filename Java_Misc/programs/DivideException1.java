package com.practice.vivek;

// When an exception is thrown, normal execution is suspended. The runtime system proceeds
// to find a matching catch block that can handle the exception. Any associated finally 
// block of a try block encountered along the search path is executed. If no handler is
// found, then the exception is dealt with by the default exception handler at the top level.
// If a handler is found, execution resumes with the code in its catch block.

public class DivideException1 {

    public static void main(String[] args) {
    	try{
    		
    		int result  = division(100,10);
    		result  = division(100,0);
        	System.out.println("result : "+result);
    	}
    	
        catch(ArithmeticException e){
    		System.out.println("Exception : "+ e.getMessage());
    	}
    }
    // if throws a exception than comes to this method

    public static int division(int totalSum, int totalNumber) throws ArithmeticException {
    	int quotient = -1;
    	System.out.println("Computing Division.");
    	try{
    		if(totalNumber == 0){
    			throw new ArithmeticException("Division attempt by 0");
    }
    		quotient  = totalSum/totalNumber;

    	}
    	finally{
    		if(quotient != -1){
    			System.out.println("Finally Block Executes");
    			System.out.println("Result : "+ quotient);
    		}else{
    			System.out.println("Finally Block Executes. Exception Occurred");
    		}

    	}
    	return quotient;
    }
}
