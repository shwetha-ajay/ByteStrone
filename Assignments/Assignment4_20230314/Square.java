package com.bytes.shapes;

public class Square {
	float side;
	
	public  Square(float length) {
		this.side=length;
		
	}
	
	
	public float getPerimeter() {
		return 4* side;
		
	}
	public float getArea() {
		return (side*side);
	}

}
