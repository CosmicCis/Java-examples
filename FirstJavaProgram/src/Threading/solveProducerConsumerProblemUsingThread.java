package Threading;

public class solveProducerConsumerProblemUsingThread {
	/*
Problem Description
How to solve the producer consumer problem using thread?

Solution
Following example demonstrates how to solve the producer consumer problem using thread.

Данный код демонстрирует решение проблемы производителя-потребителя при помощи многопоточности в Java.
В классе CubbyHole реализована общая область для хранения данных - contents, а также флаг available, указывающий на доступность данных. Метод get() используется для получения данных, а метод put() для их добавления.
Класс Consumer является потребителем и наследуется от класса Thread. В конструкторе класса инициализируются общая область для хранения данных cubbyhole и номер потребителя number. Метод run() реализует процесс потребления данных: из общей области извлекается значение методом get() и выводится на экран.
Класс Producer является производителем и также наследуется от класса Thread. В конструкторе инициализируются общая область для хранения данных cubbyhole и номер производителя number. Метод run() реализует процесс производства данных: в общую область добавляется значение методом put() и также выводится на экран.
Класс solveProducerConsumerProblemUsingThread содержит метод main(), в котором создаются объекты классов CubbyHole, Producer и Consumer. Затем запускаются потоки производителя и потребителя методами start(). В результате выполнения программы производитель и потребитель взаимодействуют через общую область для хранения данных и обеспечивают корректное выполнение задачи производителя-потребителя.
	*/
	public static void main(String[] args) {
		CubbyHole c = new CubbyHole();
		Producer p1 = new Producer(c, 1);
		Consumer c1 = new Consumer(c, 1);
		p1.start();
		c1.start();
	}
}
class CubbyHole {
	private int contents;
	private boolean available = false;

	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		available = false;
		notifyAll();
		return contents;
	}
	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) { }
		}
		contents = value;
		available = true;
		notifyAll();
	}
}
class Consumer extends Thread {
	private CubbyHole cubbyhole;
	private int number;

	public Consumer(CubbyHole c, int number) {
		cubbyhole = c;
		this.number = number;
	}
	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			value = cubbyhole.get();
			System.out.println("Consumer #" + this.number + " got: " + value);
		}
	}
}
class Producer extends Thread {
	private CubbyHole cubbyhole;
	private int number;
	public Producer(CubbyHole c, int number) {
		cubbyhole = c;
		this.number = number;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			cubbyhole.put(i);
			System.out.println("Producer #" + this.number + " put: " + i);
			try {
				sleep((int)(Math.random() * 100));
			} catch (InterruptedException e) { }
		}
	}
}
