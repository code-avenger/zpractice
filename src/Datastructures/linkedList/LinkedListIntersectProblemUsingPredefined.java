package Datastructures.linkedList;

import java.util.LinkedList;



/**
 * Two linkedlist merge into one after few nodes and from there it is one list.
 * Find out the meeting point
 * 
 * @author sudeep.gangula
 *
 */
public class LinkedListIntersectProblemUsingPredefined {

	static LinkedList<Integer> list;
	static LinkedList<Integer> list1;

	public static void main(String[] args) {

		// Default constructor - let's put "0" into head element.
		list = new LinkedList<Integer>();

		// add more elements to LinkedList
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);

		// Default constructor - let's put "0" into head element.
		list1 = new LinkedList<Integer>();


		// add more elements to LinkedList
		list1.add(22);
		list1.add(23);
		list1.add(24);
		list1.add(25);


		System.out.println("list1: " + list1.size());
		System.out.println("list: " + list.size());
		int difference = list.size() - list1.size();

		System.out.println("list1: " + list1);
		System.out.println("list: " + list);



		// Node result = getIntersectNode(0, list1.size() - 1, difference);
		// System.out.println(result.getData());

	}

	/*
	 * public static Node getIntersectNode(int start, int end, int difference) {
	 * 
	 * int mid=(start+end)/2; int mid1=mid+difference;
	 * 
	 * if (list.getNode(mid1).getData() == list1.getNode(mid).getData()) { if
	 * (list.getNode(mid1 - 1).getData() != list1.getNode(mid - 1) .getData()) {
	 * return list.getNode(mid1); }else{ return getIntersectNode(start, mid,
	 * difference); } }else{ return getIntersectNode(mid, end, difference); }
	 * 
	 * 
	 * }
	 */
}
