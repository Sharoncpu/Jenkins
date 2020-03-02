package org.sharon.spring;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements InitializingBean,DisposableBean{
	
	private ApplicationContext context=null;

	private List<Point> points;
	


	public List<Point> getPoints() {
		return points;
	}




	public void setPoints(List<Point> points) {
		this.points = points;
	}




	public void draw() {
		
		for(Point point:points) {
			System.out.println("the points are "+point.getX()+","+point.getY()+" ");
		}
	}


















	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
		// TODO Auto-generated method stub
		
	}




	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialise");
		
		// TODO Auto-generated method stub
		
	}

public void myInit() {
	System.out.println("myInit");
}

public void cleanUp() {
	System.out.println("cleanUp");
}

	

}

















/*
 * package org.sharon.spring;
 * 
 * public class Triangle {
 * 
 * private String type; private int height;
 * 
 * public int getHeight() { return height; }
 * 
 * public String getType() { return type; }
 * 
 * // public void setType(String type) { // this.type = type; // }
 * 
 * 
 * public Triangle(String type) { this.type=type; }
 * 
 * public Triangle(int height) { this.height=height; }
 * 
 * public Triangle(String type,int height) { this.type=type; this.height=height;
 * }
 * 
 * public void draw() {
 * 
 * System.out.println(getType()+ " Triangle is drawn of height "+getHeight() );
 * }
 * 
 * }
 */