package Collections;
import java.util.*;
public class rotateElementsList {
	/*
Problem Description
How to rotate elements of the List?

Solution
Following example uses rotate() method to rotate elements of the list depending on the 2nd argument of the method.
Этот код демонстрирует, как повернуть элементы в списке с помощью метода rotate() класса Collections. Сначала создается список, затем он выводится на экран. Затем метод rotate() вызывается с аргументом 3, что означает, что элементы списка будут повернуты на 3 позиции вправо. И, наконец, измененный список выводится на экран. Таким образом, вывод на экран будет содержать список с элементами, повернутыми на три позиции вправо.
	 */
	public static void main(String[] args) {
		List list = Arrays.asList("one Two three Four five six".split(" "));
		System.out.println("List :"+list);
		Collections.rotate(list, 3);
		System.out.println("rotate: " + list);
	}
}
