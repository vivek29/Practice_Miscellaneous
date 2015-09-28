package com.practice.vivek;

public class time1 {

	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int h, int m, int s){
														//using conditional operators
		hour = ((h>0 && h<24) ? h:0);
		minute = ((m>0 && m<60) ? m:0);
	    second = ((s>0 && s<60) ? s:0);
	
	}
	
								// display the entered time
	public String test(){
		
		return String.format("%02d:%02d:%02d",hour,minute,second);	// %02d for 2 point decimal		
																	// seperated be a colon
	}
	
								// display regular time
	public String test1(){
		
		return String.format("%d:%02d:%02d:%s", ((hour==0 || hour==12 ? 12 :hour%12)), minute, second, (hour<12? "AM":"PM") );
				
	}
	
	
}
