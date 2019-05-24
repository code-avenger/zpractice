package innerClass.MethodLocalInnerClass;

/**
 * 
 * @author GangulaS
 *
 *         Inner class can be declared within a method of an outer class.
 * 
 *         *Local inner class cannot access non-final local variable till JDK
 *         1.7. Since JDK 1.8, it is possible to access the non-final local
 *         variable in method local inner class.
 * 
 *         "local variable x is accessed from within inner class; needs to be
 *         declared final"
 */
class MethodDemo {
    public static void main(String[] args) {
	Outer x = new Outer();
	x.outerMethod();
    }
}

class Outer {

    void outerMethod() {
	System.out.println("inside outerMethod");
	// Inner class is local to outerMethod()

	String name = "sudeep";

	class Inner {
	    void innerMethod() {
		System.out.println("inside innerMethod");
		System.out.println("my name is : " + name);
	    }
	}
	Inner y = new Inner();
	y.innerMethod();
    }
}