package com.bytes.geometry;

import java.util.Scanner;

public class Exercise3Main {
	

	public static void main(String[]args) {
		//point//
			Scanner Obj = new Scanner(System.in);
			System.out.println("Enter the coordinates for point1");
			System.out.println("Enter the x coordinate");
			double xP1=Obj.nextDouble();
			System.out.println("Enter the y coordinate");
			double yP1=Obj.nextDouble();
			Point point1=new Point(xP1,yP1);
			
			System.out.println("Enter the coordinates for point2");
			System.out.println("Enter the x coordinate");
			double xP2=Obj.nextDouble();
			System.out.println("Enter the y coordinate");
			double yP2=Obj.nextDouble();
			Point point2=new Point(xP2,yP2);
			
			if (point1.Equal(point2)) {
				System.out.println("points are equal");
			}else {
				System.out.println("not equal");
	}
			
			
			
			
			
			
			
			
			
			
			
			
			//line//
			
			System.out.println("Enter the coordinates for line1");
			System.out.println("Enter the x1 coordinate");
			double x1=Obj.nextDouble();
			System.out.println("Enter the y1 coordinate");
			double y1=Obj.nextDouble();
			Point init1=new Point(x1,y1);
			System.out.println("Enter the x2 coordinate");
			double x2=Obj.nextDouble();
			System.out.println("Enter the y2 coordinate");
			double y2=Obj.nextDouble();
			Point final1=new Point(x2,y2);
			Line line1=new Line(init1,final1);
			
			System.out.println("Enter the coordinates for point2");
			System.out.println("Enter the x1 coordinate");
			double x3=Obj.nextDouble();
			System.out.println("Enter the y1 coordinate");
			double y3=Obj.nextDouble();
			Point init2=new Point(x3,y3);
			System.out.println("Enter the x2 coordinate");
			double x4=Obj.nextDouble();
			System.out.println("Enter the y2 coordinate");
			double y4=Obj.nextDouble();
			Point final2=new Point(x4,y4);
			Line line2=new Line(init2,final2);
			
		if (line1.Equal(line2)) {
				System.out.println("lines are equal");
			}else {
				System.out.println("not equal");
	}
			
	

	}
}

	
