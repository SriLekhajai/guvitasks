package com.java;

import java.util.Scanner;

public class prog15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        int[] studentMarks = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ": ");
            studentMarks[i] = sc.nextInt();
        }

        // Close the scanner to prevent resource leak
        sc.close();

        for (int marks : studentMarks) {
            char grade = calculateGrade(marks);
            System.out.println("Student with marks " + marks + " gets grade: " + grade);
        }
    }

    public static char calculateGrade(int marks) {
        if (marks >= 100) {
            return 'S';
        }
        else if (marks >= 99)
        {
        	return 'A';
        }
        else if (marks >= 89) {
            return 'B';
        } else if (marks >= 79) {
            return 'C';
        } else if (marks >= 69) {
            return 'D';
        } 
        else if (marks >= 59)
        {
        	return 'E';
        }
        else {
            return 'F';
        }
	}
}
