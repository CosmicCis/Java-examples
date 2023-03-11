package DataStructure;

import java.util.LinkedList;

public class addElementFirstLastPositionLinkedList2 {
	/*
Problem Description
How to add an element at first and last position of a linked list?

Solution
Following example shows how to add an element at the first and last position of a linked list by using addFirst() and addLast() method of Linked List class.
	 */
	public static final void main(String[] args) {
		LinkedList lList = new LinkedList();
		System.out.println("Number of items in the list: " + lList.size());
		String item1 = "foo";
		String item2 = "bar";
		String item3 = "sai";
		String item4 = "prasad";

		lList.add(item1);
		lList.add(item2);
		lList.addFirst(item3);
		System.out.println(lList);
		lList.addLast(item4);
		System.out.println(lList);
		System.out.println("Number of items in the list: " + lList.size());
	}
}
