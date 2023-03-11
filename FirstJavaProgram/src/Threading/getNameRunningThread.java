package Threading;

public class getNameRunningThread extends Thread {
	/*
Problem Description
How to get the name of a running thread?

Solution
Following example shows how to get the name of a running thread.
Данный код представляет собой пример использования класса Thread для работы с потоками в Java. В данном случае, создается класс getNameRunningThread, который наследует класс Thread и переопределяет его метод run(). Метод run() содержит цикл, который вызывает метод printMsg(), выводящий в консоль имя текущего потока.

В методе main() создается объект класса getNameRunningThread и вызывается метод start(), который запускает выполнение потока, связанного с данным объектом. Затем в цикле также вызывается метод printMsg(), выводящий имя текущего потока. Таким образом, на экране последовательно выводятся сообщения с именами текущих потоков, запущенных в программе.

Пример используется для демонстрации того, как можно получить имя текущего потока в Java. Класс Thread имеет метод getName(), который возвращает имя потока. В данном примере этот метод вызывается внутри метода printMsg(), который используется для вывода имени потока в консоль.
	*/
	public void run() {
		for (int i = 0; i < 10; i++) {
			printMsg();
		}
	}
	public void printMsg() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("name=" + name);
	}
	public static void main(String[] args) {
		getNameRunningThread tt = new getNameRunningThread();
		tt.start();
		for (int i = 0; i < 10; i++) {
			tt.printMsg();
		}
	}
}
