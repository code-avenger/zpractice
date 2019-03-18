package Java8Example.methodReference;


interface Sayable {
	void say();
}

public class MethodReferenceInterface {

	public void saySomething(){  
		System.out.println("Hello, this is non-static method.");  
	}

	public static void saySomethingStatic(){  
		System.out.println("Hello, this is static method.");  
	}

	public static void main(String[] args) {
		MethodReferenceInterface methodReference = new MethodReferenceInterface(); // Creating object

		// Referring non-static method using reference
		Sayable sayable = methodReference::saySomething;
		sayable.say();

		// Referring non-static method using anonymous object
		Sayable sayable2 = new MethodReferenceInterface()::saySomething; // You can use anonymous object also
		sayable2.say();

		// Referring static method 
		Sayable sayable3 = MethodReferenceInterface::saySomethingStatic; 
		sayable3.say();
	}
}
