package com.bytes.exercise7;

public class Point {

	double x;
	double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;

	}
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
//	@Override
	public boolean Equal(Object secondPoint) {
		Point point=(Point) secondPoint;
		return x == point.x && y == point.y;
		
	}	
}