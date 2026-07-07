package day6.java8Featuers;

@FunctionalInterface
interface MyReference {
	void showMessage();
}
public class MethodReferenceTest {
	void myInstanceMethod() {
		System.out.println("Example for Instance Method reference");
	}
	static void myStaticMethod() {
		System.out.println("Example for static Method reference");
	}
	
	MethodReferenceTest() {
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		
		//Reference to a instance method
		MethodReferenceTest obj = new MethodReferenceTest();
		MyReference reference = obj:: myInstanceMethod;
		
		//Reference to a static method
		reference = MethodReferenceTest::myStaticMethod;
		reference.showMessage();
		
		//Reference to a Constructor
		reference = MethodReferenceTest::new;
		reference.showMessage();
		
	}

}
