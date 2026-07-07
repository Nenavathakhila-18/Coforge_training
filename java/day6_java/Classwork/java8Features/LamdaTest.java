package day6.java8Featuers;

@FunctionalInterface
interface Calculator {
	public int calc(int a, int b);
}

public class LamdaTest {

	public static void main(String[] args) {
		Calculator calculator = (a, b) -> a + b;
		System.out.println(calculator.calc(10, 20));
		
		// lamda expression anonymus function
		calculator = (a, b) -> a - b;
		System.out.println(calculator.calc(10, 20));

		calculator = (a, b) -> a / b;
		System.out.println(calculator.calc(10, 20));

		calculator = (a, b) -> a * b;
		System.out.println(calculator.calc(10, 20));
	}

}
