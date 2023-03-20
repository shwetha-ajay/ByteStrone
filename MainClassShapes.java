package com.bytes.shapes;

import java.util.Scanner;

public class MainClassShapes {
	public static void main(String[]args) {
	   String cont;
	
		do {
	
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter the shape");
		String shape = Obj.nextLine();
		
		switch(shape) {
		case "square":
			System.out.println("Enter length of a side");
			float side=Obj.nextFloat();
			Square square= new Square(side);
			System.out.println("perimeter is: "+square.getPerimeter());
			System.out.println("area is: "+square.getArea());
			break;
			
		case "rectangle":
			System.out.println("Enter length of rectangle");
			double length=Obj.nextDouble();
			System.out.println("Enter breadth of rectangle");
			double breadth=Obj.nextDouble();
			Rectangle rectangle= new Rectangle(length,breadth);
			System.out.println("perimeter is: "+rectangle.getPerimeter());
			System.out.println("area is: "+rectangle.getArea());
			break;
			
		case "circle":
			System.out.println("Enter the radius");
			double radius=Obj.nextDouble();
	        Circle circle= new Circle(radius);
			System.out.println("perimeter is: "+circle.getPerimeter());
			System.out.println("area is: "+circle.getArea());
			break;
			
		case "triangle":
			System.out.println("Enter length of side1");
			double sideA=Obj.nextDouble();
			System.out.println("Enter length of side2");
			double sideB=Obj.nextDouble();
			System.out.println("Enter length of side3");
			double sideC=Obj.nextDouble();
			
			Triangle triangle= new Triangle();
			System.out.println("perimeter is: "+triangle.getPerimeter(sideA,sideB,sideC));
			System.out.println("area is: "+triangle.getArea(sideA,sideB,sideC));
			break;
			
		default:
			System.out.println("This is a wrong choice");
			break;
		}
		System.out.println("do you want to continue(y/n)");
		cont = Obj.next();
	} while (cont.equals("y"));   
		

}

}

		
			
			
		


