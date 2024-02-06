package com.java;

import java.util.Scanner;

public class prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int x, y, z; 
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of X and Y");  
	       x = sc.nextInt();  
	       y = sc.nextInt();  
	       System.out.println("before swapping numbers: "+x +"  "+ y);  
	       
	       z = x;  
	       x = y;  
	       y = z;  
	       System.out.println("After swapping: "+x +"   " + y);  
	       System.out.println( );  
	}

}
