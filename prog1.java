package com.java;

import java.util.Scanner;


public class prog1 {

	public static void main(String[] args) 
	{
		int a, b, c, d;
		
		
		Scanner sc = new Scanner(System.in);
			
		
		System.out.println("Enter the a and b value:");
		
		System.out.println("Enter the c and d value");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		// TODO Auto-generated method stub
		
		
		if((a+b)>(c+d))
		{
			System.out.println("the sum of a and b is greater than sum of c and d");
			
		}
		else
		{
			System.out.println("the sum of c and d is greater than sum of a and b");

			}
	}
}
