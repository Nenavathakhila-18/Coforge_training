package com.coforge.day4.exception;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt(); // user input
		
		if(age >= 18) {
			System.out.println("Welcome to vote");
		}else {
			try {
			throw new InvalidAgeException();
			} catch(InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
		}	

	}

}
