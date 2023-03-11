package Threading;

public class getPrioritiesRunningThreads extends Thread {
	/*
Problem Description
How to get the priorities of running threads?

Solution
Following example prints the priority of the running threads by using setPriority() method .
Код на языке Java, который демонстрирует создание потоков и установку приоритетов для них.

Класс getPrioritiesRunningThreads наследует класс Thread, переопределяет метод run() и имеет конструктор, который принимает значение приоритета и устанавливает его для потока.

В методе run() происходит бесконечный цикл, в котором производится некоторое вычисление и выводятся значения приоритета потока и его счетчика. Переменная countDown инициализируется значением 5, а переменная d объявляется с модификатором volatile, чтобы обеспечить ее видимость в разных потоках.

В методе main() создается один поток с максимальным приоритетом и пять потоков с минимальным приоритетом. Поток с максимальным приоритетом запускается первым и выполняется бесконечно. Потоки с минимальным приоритетом запускаются после потока с максимальным приоритетом и выполняются по пять раз каждый, после чего завершаются.

При выполнении потоки выводят свои приоритеты и значения счетчиков, используя метод toString(). Вывод программы может различаться в зависимости от алгоритма планировщика потоков в системе, но поток с максимальным приоритетом должен выполняться чаще, чем потоки с минимальным приоритетом.

В целом, этот код демонстрирует, как устанавливать приоритеты для потоков в Java и как это может влиять на планирование и выполнение потоков.
	*/
	private int countDown = 5;
	private volatile double d = 0;
	public getPrioritiesRunningThreads(int priority) {
		setPriority(priority);
		start();
	}
	public String toString() {
		return super.toString() + ": " + countDown;
	}
	public void run() {
		while(true) {
			for(int i = 1; i < 100000; i++) d = d + (Math.PI + Math.E) / (double)i;
			System.out.println(this);
			if(--countDown == 0) return;
		}
	}
	public static void main(String[] args) {
		new getPrioritiesRunningThreads(Thread.MAX_PRIORITY);
		for(int i = 0; i < 5; i++)
			new getPrioritiesRunningThreads(Thread.MIN_PRIORITY);
	}
}
