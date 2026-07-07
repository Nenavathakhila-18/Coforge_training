package com.coforge.assignment.day3;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	
	int n = sc.nextInt();
	int sum = n * (n+1) / 2;
	System.out.println("The sum is " + sum);
	sc.close();
}
}