package com.coforge.assignment.day3;

import java.util.Scanner;

public class GradeCalculatorApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		
		int n = sc.nextInt();
		
		if(n < 60 ) {
			System.out.println("Fail");
		}
		else if(n >= 69 && n < 60) {
			System.out.println("Grade D");
		}
		else if(n >= 70 && n < 79) {
			System.out.println("Grade C");
		}
		else if(n >= 80 && n < 90) {
			System.out.println("Grade B");
		}
		else if(n >= 90 && n <= 100) {
			System.out.println("Grade A");
		}
		
		else {
			System.out.println("Invalid Marks");
		}

	}

}