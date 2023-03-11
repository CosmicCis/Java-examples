package Threading;

public class checkThreadAliveNot extends Thread {
	/*
Problem Description
How to check a thread is alive or not?

Solution
Following example demonstrates how to check a thread is alive or not by extending Threda class and using currentThread() method.
Данный код демонстрирует, как проверить, жив ли поток (thread) или нет. Создается класс checkThreadAliveNot, который наследуется от класса Thread. Он содержит метод run(), который выводит в консоль имя текущего потока (получаемое с помощью метода currentThread().getName()) 10 раз. Еще в классе определяется метод printMsg(), который также выводит имя текущего потока.

В методе main() создается объект класса checkThreadAliveNot с именем tt. Перед запуском потока устанавливается его имя с помощью метода setName(). После этого выводится значение метода isAlive() для потока tt. Затем поток запускается с помощью метода start(). Вновь выводится значение метода isAlive() для потока tt.

Далее в цикле 10 раз вызывается метод printMsg() у объекта tt. После этого выводится значение метода isAlive() для потока tt.
	*/
	public void run() {
		for (int i = 0; i < 10; i++) {
			printMsg();
		}
	}
	public void printMsg() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("name = " + name);
	}
	public static void main(String[] args) {
		checkThreadAliveNot tt = new checkThreadAliveNot();
		tt.setName("Thread");
		System.out.println("before start(), tt.isAlive() = " + tt.isAlive());
		tt.start();
		System.out.println("just after start(), tt.isAlive() = " + tt.isAlive());

		for (int i = 0; i < 10; i++) {
			tt.printMsg();
		}
		System.out.println("The end of main(), tt.isAlive()=" + tt.isAlive());
	}
}
