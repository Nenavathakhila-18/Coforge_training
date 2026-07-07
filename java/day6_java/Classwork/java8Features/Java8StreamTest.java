package day6.java8Featuers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8StreamTest {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(11, 12, 13, 14);

		// Collect even numbers into a list
		List<Integer> even = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		System.out.println(even);

		// Count even numbers
		long count = list.stream().filter(n -> n % 2 == 0).count();

		System.out.println(count);

		// Print even numbers
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		list.stream().filter(n -> n % 2 == 0).map(n -> n * 2).forEach(System.out::println);

		List<String> names = Arrays.asList("Ram", "Shyam", "Ramesh", "Suresh");
		names.stream().filter(s -> s.contains("a")).map(s -> s.length()).forEach(System.out::println);
		Map<Integer, String> map = names.stream().collect(Collectors.toMap(x -> x.length(), x -> x));

		System.out.println(map);
	}
}