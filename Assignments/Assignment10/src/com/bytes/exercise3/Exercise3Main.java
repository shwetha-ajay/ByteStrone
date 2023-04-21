package com.bytes.exercise3;

import java.util.Scanner;

public class Exercise3Main {
	public static void main(String[] args) {
		Scanner Obj=new Scanner(System.in);
		System.out.println("enter the radius: ");
		double radius=Obj.nextDouble();
        Circle circle= new Circle(radius);
		System.out.println("perimeter is: "+circle.getPerimeter());
		System.out.println("area is: "+circle.getArea());
		
		
		System.out.println("Enter length of rectangle");
		double length=Obj.nextDouble();
		System.out.println("Enter breadth of rectangle");
		double breadth=Obj.nextDouble();
		Rectangle rectangle= new Rectangle(length,breadth);
		System.out.println("perimeter is: "+rectangle.getPerimeter());
		System.out.println("area is: "+rectangle.getArea());
		
		
		System.out.println("Enter length of side1");
		double sideA=Obj.nextDouble();
		System.out.println("Enter length of side2");
		double sideB=Obj.nextDouble();
		System.out.println("Enter length of side3");
		double sideC=Obj.nextDouble();
		
		Triangle triangle= new Triangle(sideA,sideB,sideC);
		System.out.println("perimeter is: "+triangle.getPerimeter());
		System.out.println("area is: "+triangle.getArea());
				
	}

}
