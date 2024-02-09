package com.java;

import java.util.Scanner;

public class prog13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int num=1;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Enter the Row Size: ");
	      int row = sc.nextInt();
	      
	      for(int i=0; i<row; i++)
	      {
	         for(int j=0; j<=i; j++)
	         {
	            System.out.print(num+ " ");
	            num++;
	         }
	         
	         System.out.print("\n");
	      }
	}

}
