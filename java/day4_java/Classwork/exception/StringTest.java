package com.coforge.day4.exception;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "Java"; // takes memory from stringpool
		String s2 = new String("java"); //  takes memory from heap 
		
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		
		System.out.println(s1.length());
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.charAt(1)); // a
		
		System.out.println(s1.indexOf('a')); //3
		System.out.println(s1.lastIndexOf('a')); //3
		System.out.println(s1.indexOf('b')); // -1;
		
		String s3 = s1.concat(" world"); // java world
		System.out.println(s3.substring(3,7)); // a wo
		System.out.println(s3.substring(3)); // a world
		
	}

}
