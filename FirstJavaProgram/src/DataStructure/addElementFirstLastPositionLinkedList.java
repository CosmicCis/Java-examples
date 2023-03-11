package DataStructure;

import java.util.LinkedList;

public class addElementFirstLastPositionLinkedList {
	/*
Problem Description
How to add an element at first and last position of a linked list?

Solution
Following example shows how to add an element at the first and last position of a linked list by using addFirst() and addLast() method of Linked List class.
Данный код представляет пример использования методов addFirst() и addLast() класса LinkedList для добавления элементов в начало и конец связного списка соответственно.
В данном случае создается объект lList класса LinkedList и заполняется пятью элементами, после чего содержимое списка выводится на экран с помощью метода println() класса System.out.
Затем в список добавляется новый элемент в начало с помощью метода addFirst(), и содержимое списка снова выводится на экран.
Далее в список добавляется новый элемент в конец с помощью метода addLast(), и содержимое списка снова выводится на экран.
	 */
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");
		System.out.println(lList);

		lList.addFirst("0");
		System.out.println(lList);

		lList.addLast("6");
		System.out.println(lList);
	}
}
