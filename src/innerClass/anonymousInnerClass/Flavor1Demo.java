package innerClass.anonymousInnerClass;

/**
 * 
 * @author GangulaS
 *
 *         Anonymous inner classes are declared without any name at all. They
 *         are created in two ways.
 * 
 *         *1)As subclass of specified type
 * 
 *         *2)As implementer of the specified interface ( Demo should be
 *         interface not class)
 */
class Demo {
    void show() {
	System.out.println("i am in show method of super class");
    }
}

class Flavor1Demo {

    // An anonymous class with Demo as base class
    static Demo d = new Demo() {
	void show() {
	    super.show();
	    System.out.println("i am in Flavor1Demo class");
	}
    };

    public static void main(String[] args) {
	d.show();
    }
}