package Java8Example.methodReference;


interface Sayable {
	void say();
}

public class MethodReferenceInterface {

	public void saySomething(){  
		System.out.println("Hello, this is non-static method.");  
	}

	public static void main(String[] args) {
		MethodReferenceInterface methodReference = new MethodReferenceInterface(); // Creating object

		// Referring non-static method using reference
		Sayable sayable = methodReference::saySomething;

		// Calling interface method
		sayable.say();

		// Referring non-static method using anonymous object
		Sayable sayable2 = new MethodReferenceInterface()::saySomething; // You can use anonymous object also

		// Calling interface method
		sayable2.say();
	}
}
