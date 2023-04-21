package com.bytes.exercise3;

public class Rectangle implements Shape{
	double length;
	double breadth;
	
	public Rectangle(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}

	@Override
	public double getArea() {
		
		return length*breadth;
	}

	@Override
	public double getPerimeter() {
		
		return 2*(length+breadth);
	}

}
