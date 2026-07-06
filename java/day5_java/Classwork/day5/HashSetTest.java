package com.cofoge.day5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		
		Set <Integer> set = new HashSet<> ();
		
		set.add(new Integer(10)); //Boxing manual conversion using new keyword
		set.add(20); // autoboxing autometically internal conversion
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(20); // duplicate

		System.out.println(set);
		
		// removing the index element 
		
		set.remove(40);
		
		System.out.println(set); // internally declared tostring method (override)
	
		for(Integer i : set)
			System.out.println(i);
	
	   // Traverse using interator
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

}
}
