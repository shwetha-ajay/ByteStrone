package com.bytes.assignment3;

public class StarPyramid {
	
	   public static void main(String[] args)
	   {
	      int i, j,row=5 ,space;
	      
	      for(i=0; i<row; i++)
	      {
	         for(space=i; space<row; space++)
	            System.out.print(" ");
	         for(j=0; j<=i; j++)
	            System.out.print("* ");
	         System.out.print("\n");
	      }
	   }
	}


