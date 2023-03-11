package Collections;

import java.util.*;

public class findMiMmaxList {
	/*
Problem Description
How to find min & max of a List?

Solution
Following example uses min & max Methods to find minimum & maximum of the List.
Данный код демонстрирует, как найти минимальный и максимальный элементы в списке (List) при помощи методов max() и min() из класса Collections.

Сначала в методе main() создается список (List) из строк, которые получаются из строки "one Two three Four five six one three Four" путем разделения ее на слова, используя метод split() и пробел в качестве разделителя. Затем список выводится на экран.

Далее методы Collections.max() и Collections.min() используются для поиска максимального и минимального элементов в списке соответственно. Результаты поиска выводятся на экран при помощи метода System.out.println().
	*/
	public static void main(String[] args) {
		List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		System.out.println(list);
		System.out.println("max: " + Collections.max(list));
		System.out.println("min: " + Collections.min(list));
	}
}
