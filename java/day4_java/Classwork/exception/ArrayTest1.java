package com.coforge.day4.exception;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		int arr[] = {10, 20 , 30, 40, 50};
		
		for(int i = 0;i < arr.length; i++) {
			System.out.println("Array [ " + i + " ] " + arr[i]);
			sum  = sum + arr[i] ;
		}
		
		System.out.println(" sum = " + sum);

	}

}
