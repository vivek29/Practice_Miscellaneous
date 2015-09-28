package com.test.spring.SpringTest;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

// public class Triangle implements ApplicationContextAware, BeanNameAware {

//InitializingBean and DisposableBean have priority over manual init and destroy method(thru spring.xml)
// public class Triangle implements InitializingBean, DisposableBean {	

public class Triangle implements Shape{	

	/*	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}*/
	
	private Point pointA;
	private Point pointB;
	private Point pointC;

//  private ApplicationContext context = null;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw(){
		System.out.println("Drawing triangle");
		System.out.println("Point A = ("+getPointA().getX()+", "+getPointA().getY()+")");
		System.out.println("Point B = ("+getPointB().getX()+", "+getPointB().getY()+")");
		System.out.println("Point C = ("+getPointC().getX()+", "+getPointC().getY()+")");
	}
/*
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		
	}

	public void setBeanName(String beanName) {
		System.out.println("BeanName is : " +beanName );		
	}

*/	
	/*public void draw(){		// for List(Collections)
		
		for(Point point: points){
			System.out.println("Point A = ("+point.getX()+", "+point.getY()+")");
		}
	}*/

/*	public void afterPropertiesSet() throws Exception {
		System.out.println("init method called");
	}

	public void destroy() throws Exception {				// need to shutdown ApplicationContext to run this
		System.out.println("destroy method called");		
	}
	*/
	
/*	public void myinit(){
		System.out.println("my init method called");
	}
	
	public void mydestroy(){
		System.out.println("my destroy method called");
	}
*/
	
}
