package com.coforge.day4.exception;

public class ExceptionTest2 {

	public static void main(String[] args) {
		System.out.println("Before exception");
		
		try {
		
		// int a = 10 / 0; //ArithmeticException
		// int b = Integer.parseInt("abc");
			
		int[] arr = new int[-5];
		} catch (ArithmeticException e) {
			System.out.println(" Error : " + e.getMessage());
			
		}catch (NumberFormatException e) {
			System.out.println(" Error : " + e.getMessage());
			
		} catch(Exception e) {
			// super class of all the exception
			System.out.println(" Error : " + e.getMessage());
		}
		
		
		
		System.out.println("After exception");

	}

}
