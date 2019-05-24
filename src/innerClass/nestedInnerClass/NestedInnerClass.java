package innerClass.nestedInnerClass;

/**
 * 
 * @author GangulaS
 * 
 *         Nested Inner class can access any private instance variable of outer
 *         class.
 * 
 *         *we can’t have static method in a nested inner class because an inner
 *         class is implicitly associated with an object of its outer class so
 *         it cannot define any static method for itself.
 *
 */
public class NestedInnerClass {

    public static void main(String[] args) {
	Outer.Inner in = new Outer().new Inner();
	in.show();
    }

}

class Outer {
    class Inner {
	public void show() {
	    System.out.println("In a nested class method");
	}

	// Below code will give compile time error if we uncomment this.
	/*public static void display() {
	    System.out.println("In a nested class static method");
	}*/
    }
}

class Main {
    public static void main(String[] args) {
	Outer.Inner in = new Outer().new Inner();
	in.show();
    }
}
