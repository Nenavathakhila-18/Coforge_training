package com.cofoge.day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<> ();
		
		list.add(new Integer(10)); //Boxing manual conversion using new keyword
		list.add(20); // autoboxing autometically internal conversion
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(20); // duplicate

		System.out.println(list);
		System.out.println(list.get(1));
		
		// removing the index element 
		
		list.remove(4);
		
		System.out.println(list); // internally declared tostring method (override)
		
		list.set(3,80);
		System.out.println(list);
		
		// traversing 
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	   // traversing without index
		
		for(Integer i : list)
			System.out.println(i);
	
	   // Traverse using interator
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

}
}
