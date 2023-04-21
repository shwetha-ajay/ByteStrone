package com.bytes.exercise3;

public class Triangle implements Shape{
	 double sideA;
	 double sideB;
	 double sideC;
	double  s=(sideA+sideB+sideC)/2;
	
	public Triangle(double sideA,double sideB,double sideC) {
		this.sideA=sideA;
		this.sideB=sideB;
		this.sideC=sideC;
	}
	

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return  sideA+sideB+sideC;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.sqrt(s *(s-sideA) *(s-sideB) *(s-sideC));
	}
	
}
