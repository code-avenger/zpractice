package Datastructures.linkedList;

public class LinkedListGen {

	public static LinkedListImplemented list;

	public static void main(String[] args) {

		// Default constructor - let's put "0" into head element.
		list = new LinkedListImplemented();

		// add more elements to LinkedList
		list.add("11");
		list.add("14");
		list.add("13");

		list.add("12");
		list.add("15");

		list.add("16", 2);


		/*
		 * Please note that primitive values can not be added into LinkedList directly. They must be converted to their corresponding wrapper class.
		 */

		System.out.println("Print: List: \t\t" + list);
		System.out.println(".size(): \t\t\t\t" + list.size());
		System.out.println(".get(3): \t\t\t\t" + list.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".remove(2): \t\t\t\t" + list.remove(2) + " (element removed)");
		System.out.println(".get(3): \t\t\t\t" + list.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".size(): \t\t\t\t" + list.size());
		System.out.println("Print again: List: \t" + list);
	}

}


