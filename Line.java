package com.bytes.geometry;

public class Line {
	double x1;
	double y1;
	double x2;
	double y2;
	Point init;
	Point final1;
	double dx=x2-x1;
	double dy=y2-y1;
	
	public Line(Point init,Point final1) {
		this.init= init;
		this.final1= final1;
	}
	
	public Point getInit() {
		return init;
	}
	public Point getfinal1() {
		return final1;
	}
	
	
	public double getLength() {
		return Math.sqrt(dx*dx + dy*dy);
		
	}
//	Line(){
//		return this.init.Equal(Point.x);
//	}
	public boolean Equal(Line second) {
		return init==second.init && final1==second.final1;
		
		
	}
	
}
