package Thread.shallowCopyVsDeepCopy.deepCopy;





public class DeepCopyTest {

	public static void main(String[] args) {
		// Original Object
		Student stud1 = new Student("John", "Algebra");

		System.out.println("Original Object: " + stud1.getName() + " - "
				+ stud1.getSubj().getName());

		// Clone Object
		Student clonedStud = (Student) stud1.clone();

		System.out.println("Cloned Object: " + clonedStud.getName() + " - "
				+ clonedStud.getSubj().getName());

		stud1.setName("Dan");
		stud1.getSubj().setName("Physics");

		System.out.println("Original Object after it is updated: "
				+ stud1.getName() + " - " + stud1.getSubj().getName());

		System.out
				.println("Cloned Object after updating original object: "
						+ clonedStud.getName() + " - "
						+ clonedStud.getSubj().getName());
	}





}
