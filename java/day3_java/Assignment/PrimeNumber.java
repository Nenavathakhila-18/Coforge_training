package com.coforge.assignment.day3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not Prime number");
		}
		sc.close();

	}

}
