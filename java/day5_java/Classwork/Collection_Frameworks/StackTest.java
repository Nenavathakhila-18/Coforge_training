package com.cofoge.day5;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		stack.push(12);
		stack.push(10);
		stack.push(11);
		stack.push(14);
		
		
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack); // removes the top element
		
		System.out.println(stack.peek()); // displays the top element
	}

}
