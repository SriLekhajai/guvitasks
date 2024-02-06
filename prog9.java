package com.java;

import java.util.Scanner;

public class prog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int age;

		    Scanner input = new Scanner(System.in);

		    System.out.print("Enter the age :");

		    age = input.nextInt();

		    if (age >= 65) {
		      System.out.println("Senior Citizen");
		      //      seniorCitizens = seniorCitizens + 1;
		      
		    } else {
		      System.out.println("Non-Senior Citizen");
		     
		    }
	}

}
