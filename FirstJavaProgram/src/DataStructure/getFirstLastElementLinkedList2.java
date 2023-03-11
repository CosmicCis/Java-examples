package DataStructure;

import java.util.LinkedList;

public class getFirstLastElementLinkedList2 {
	/*
Problem Description
How to get the first and the last element of a linked list?

Solution
Following example shows how to get the first and last element of a linked list with the help of linkedlistname.getFirst() and linkedlistname.getLast() of LinkedList class.
Данный код на языке Java представляет из себя программу, которая создает связанный список (linked list) из объектов неопределенного типа, добавляет в него пять элементов и затем выводит на экран первый и последний элементы списка.
Основная логика программы заключается в использовании класса LinkedList из стандартной библиотеки Java для создания и управления связанным списком. В отличие от предыдущего примера, в данном случае не указан тип элементов связанного списка, поэтому для создания объекта LinkedList используется конструктор без параметров.
Затем в список добавляются пять элементов с помощью метода add() объекта lList. Каждый элемент является строковым значением, которое передается как аргумент метода add().
После этого, с помощью метода getFirst() объекта lList, программа получает первый элемент связанного списка и выводит его на экран. Аналогично, с помощью метода getLast() программа получает последний элемент связанного списка и выводит его на экран.
В итоге, программа выводит на экран следующие две строки:
"First element is : 1", что означает, что первый элемент списка равен "1";
"Last element is : 5", что означает, что последний элемент списка равен "5".

	*/
	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");
		System.out.println("First element is : " + lList.getFirst());
		System.out.println("Last element is : " + lList.getLast());
	}
}
