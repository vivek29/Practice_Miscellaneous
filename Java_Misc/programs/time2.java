package com.practice.vivek;

public class time2 {

	public static void main(String ar[]){
		
		time1 obj = new time1();
		System.out.println(obj.test());
			
//		obj.setTime(3, 56, 38);
//		System.out.println(obj.test());
	
		System.out.println(obj.test1());				// by deault it takes 12:00:00 AM
									// bcoz in condition we have written if hour =0, than 12
		
		obj.setTime(13, 56, 38);
		System.out.println(obj.test());			// displays entered time as it is

		System.out.println(obj.test1());		// converts and than displays.
		
		
	}
	
	
}
