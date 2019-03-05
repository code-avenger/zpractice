package Java8Example.defaultExample;

public class MyClass implements Interface1, Interface2 {
	@Override
	public void method2() {
		System.out.println("method 2: ");
	}

	@Override
	public void method1(String str) {
		System.out.println("method 1: " + str);
	}

	@Override
	public void log(String str) {
		System.out.println("MyClass logging::" + str);
		Interface1.super.log(str);
	}

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.method1("sudeep");
	}

	// // @Override
	// public void log(String str) {
	// System.out.println("MyClass logging::" + str);
	// // Interface1.log("abc");
	// }
}
