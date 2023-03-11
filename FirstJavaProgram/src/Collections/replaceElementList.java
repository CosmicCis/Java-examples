package Collections;
import java.util.*;
public class replaceElementList {
	/*
Problem Description
How to replace an element in a list

Solution
Following example uses replaceAll() method to replace all the occurance of an element with a different element in a list.
Этот код заменяет все вхождения одного элемента списка на другой элемент. Он использует метод replaceAll() из класса Collections для этого. В данном случае, он заменяет все вхождения строки "one" на "hundred" в списке, который создается с помощью метода Arrays.asList(), и затем выводит измененный список в консоль.
	*/
	public static void main(String[] args) {
		List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		System.out.println("List :"+list);
		Collections.replaceAll(list, "one", "hundread");
		System.out.println("replaceAll: " + list);
	}
}
