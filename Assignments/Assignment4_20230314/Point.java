package com.bytes.geometry;

public class Point {
	double x;
	double y;
	
	public Point(double x,double y) {
		this.x= x;
		this.y= y;
		
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public boolean Equal(Point secondPoint) {
		return x==secondPoint.x && y==secondPoint.y;
		
		
	}

}
