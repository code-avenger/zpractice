package Datastructures.linkedList;

import Datastructures.linkedList.LinkedListImplemented.Node;

/**
 * Two linkedlist merge into one after few nodes and from there it is one list.
 * Find out the meeting point
 * 
 * @author sudeep.gangula
 *
 */
public class LinkedListIntersectProblem {

	static LinkedListImplemented list;
	static LinkedListImplemented list1;

	public static void main(String[] args) {

		// Default constructor - let's put "0" into head element.
		list = new LinkedListImplemented();

		// add more elements to LinkedList
		list.add("10");
		list.add("11");
		list.add("12");
		list.add("13");
		list.add("14");
		list.add("15");
		list.add("16");
		list.add("17");
		list.add("18");
		list.add("19");

		// Default constructor - let's put "0" into head element.
		list1 = new LinkedListImplemented();


		// add more elements to LinkedList
		list1.add("22");
		list1.add("23");
		list1.add("24");
		list1.add("15");


		Node last = (Node) list1.getNode(list1.size() - 1);

		last.setNext(list.getNode(7));
		list1.setCounter(list1.size() + 3);

		int difference = list.size() - list1.size();

		System.out.println("list1: " + list1.size());
		System.out.println("list: " + list.size());

		Node result = getIntersectNode(0, list1.size() - 1, difference);
		if (null != result) {
			System.out.println(result.getData());
		} else {
			System.out.println("There is no intersection point.");
		}

	}

	public static Node getIntersectNode(int start, int end, int difference) {

		if (start == (end - 1)) {
			if (list.getNode(start + difference).equals(list1.getNode(start))) {
				return list1.getNode(start);
			} else if (list.getNode(end + difference)
					.equals(list1.getNode(end))) {
				return list1.getNode(end);
			}else{
				return null;
			}
		}

		int mid=(start+end)/2;
		int mid1=mid+difference;

		if (list.getNode(mid1).equals(list1.getNode(mid))) {
			if (!list.getNode(mid1 - 1).equals(list1.getNode(mid - 1))) {
				return list.getNode(mid1);
			}else{
				return getIntersectNode(start, mid, difference);
			}
		}else{
			return getIntersectNode(mid, end, difference);
		}


	}
}
