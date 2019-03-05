package doubts.inheritance;

public class InheritanceCasting {

	public static void main(String[] args) {

		Child child = new Child();
		Parent parent = new Parent();
		Parent parentButChild = new Child();

		child.test();
		parent.test();
		parentButChild.test();

		Child childButParent = (Child) new Parent();
		// Not Possible. Will get classCastException (RunTime exception)
		childButParent.test();

	}
}

class Parent {
	public void test() {
		System.out.println("Parent");
	}

}

class Child extends Parent {
	public void test() {
		System.out.println("Child");
	}
}
