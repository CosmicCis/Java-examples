package DataStructure;

import java.util.LinkedList;

public class getFirstLastElementLinkedList {
	/*
Problem Description
How to get the first and the last element of a linked list?

Solution
Following example shows how to get the first and last element of a linked list with the help of linkedlistname.getFirst() and linkedlistname.getLast() of LinkedList class.
Данный код на языке Java представляет из себя программу, которая создает связанный список (linked list) из строковых элементов, добавляет в него пять элементов и затем выводит на экран первый и последний элементы списка.
Основная логика программы заключается в использовании класса LinkedList из стандартной библиотеки Java для создания и управления связанным списком. Сначала в программе создается пустой связанный список lList, используя конструктор LinkedList<String>().
Затем в список добавляются пять элементов с помощью метода add() объекта lList. Каждый элемент является строковым значением, которое передается как аргумент метода add().
После этого, с помощью метода getFirst() объекта lList, программа получает первый элемент связанного списка и выводит его на экран. Аналогично, с помощью метода getLast() программа получает последний элемент связанного списка и выводит его на экран.
В итоге, программа выводит на экран следующие две строки:
"First element of LinkedList is : 100", что означает, что первый элемент списка равен "100";
"Last element of LinkedList is : 500", что означает, что последний элемент списка равен "500".
	*/
	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("100");
		lList.add("200");
		lList.add("300");
		lList.add("400");
		lList.add("500");
		System.out.println("First element of LinkedList is : " + lList.getFirst());
		System.out.println("Last element of LinkedList is : " + lList.getLast());
	}
}