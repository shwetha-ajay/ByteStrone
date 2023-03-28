package com.bytes.shapes;

public class Triangle {
	double sideA;
	double sideB;
	double sideC;
	double s=(sideA+sideB+sideC)/2;
	
//	public  Triangle(double sideA,double sideB,double sideC) {
//		this.sideA=sideA;
//		this.sideB=sideB;
//		this.sideC=sideC;
//		
//	}
	
	
	public double getPerimeter(double sideA,double sideB,double sideC) {
		return sideA+sideB+sideC;
		
	}
	public double getArea(double sideA,double sideB,double sideC) {
		return Math.sqrt(s *(s-sideA) *(s-sideB) *(s-sideC));
	}

}



