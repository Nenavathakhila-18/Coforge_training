package day6.java8Featuers;

interface MyInterface {

	public default void myMethod1() {
		System.out.println("Default Method");
	}

	public void myMethod2();

	public static void myMethod3() {
		System.out.println("Static method");

	}
}


public abstract class java8InterfaceTest implements MyInterface{
	@Override
	public void myMethod1() {
		System.out.println("Default Method");
	}
	
	//@Override
	//public static void myMethod3() {
		//System.out.println("Static method");

	//}
	
	public static void main(String[] args) {
		
	}

}
