package DataStructure;

public class printSummationNumbers2 {
	/*
Problem Description
How to print summation of numbers?

Solution
Following example demonstrates how to add first n natural numbers by using the concept of stack.
Данный код на языке Java представляет из себя простую программу, которая вычисляет сумму первых 50 натуральных чисел и выводит результат на экран.
Основная логика программы заключается в использовании цикла for для перебора всех натуральных чисел от 1 до 50 и накоплении их суммы в переменной sum. В каждой итерации цикла i принимает значение от 1 до 50, и к текущему значению sum прибавляется значение i.
После завершения цикла, программа выводит на экран сообщение с результатом вычисления суммы всех чисел от 1 до 50. Вывод осуществляется с помощью метода System.out.println, который принимает строку в качестве аргумента и выводит ее на экран.
В итоге, программа выводит сообщение "The Sum Of 50 is 1275", что означает, что сумма всех натуральных чисел от 1 до 50 равна 1275.
	*/
	public static void main(String[] args) {
		int sum = 0;
		int n = 50;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("The Sum Of " + n + " is " + sum);
	}
}