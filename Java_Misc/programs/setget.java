package com.practice.vivek;

public class setget {

	private int hour;
	private int minute;
	private int second;
	
	public setget(){						// no return type
		this(0,0,0);
	}
	
	public setget(int h){					// no return type
		this(h,0,0);
	}
	
	public setget(int h,int m){				// no return ype
		
		this(h,m,0);
	}

	public setget(int h, int m ,int s){		// no return type
	
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	public void setHour(int h){
		
		hour = ((h>0 && h<24) ? h:0);
	}
	
	public void setMinute(int m){
		
		minute = ((m>0 && m<60) ? m:0);
	}
	
	public void setSecond(int s){
		
		second = ((s>0 && s<60) ? s:0);
		
	}
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSecond(){
		return second;
	}
	
	
public String test(){
		
		return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());			
																	
	}
}
