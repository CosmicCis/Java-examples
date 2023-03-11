package Collections;

import java.util.*;

public class findSublistList {
	/*
Problem Description
How to find a sublist in a List?

Solution
Following example uses indexOfSubList() & lastIndexOfSubList() to check whether the sublist is there in the list or not & to find the last occurance of the sublist in the list.
Этот код ищет саблист в списке и выводит индекс первого и последнего вхождения саблиста в список.

В начале создается список list и выводится на экран. Затем создается саблист sublist, который содержит элементы "three" и "Four". Затем метод indexOfSubList() используется для проверки, есть ли саблист в списке, и он выводит индекс первого вхождения. Затем метод lastIndexOfSubList() используется для поиска последнего вхождения саблиста в списке, и он выводит индекс последнего вхождения. В конце выводится информация о саблисте и индексах его вхождений в список.
	*/
	public static void main(String[] args) {
		List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		System.out.println("List :"+list);

		List sublist = Arrays.asList("three Four".split(" "));
		System.out.println("SubList :"+sublist);
		System.out.println(
				"indexOfSubList: " + Collections.indexOfSubList(list, sublist));

		System.out.println(
				"lastIndexOfSubList: " + Collections.lastIndexOfSubList(list, sublist));
	}
}
