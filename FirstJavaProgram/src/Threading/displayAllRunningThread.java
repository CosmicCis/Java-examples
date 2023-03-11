package Threading;

public class displayAllRunningThread extends Thread {
	/*
Problem Description
How to display all running Thread?

Solution
Following example demonstrates how to display names of all the running threads using getName() method.
Данный код на Java демонстрирует, как отобразить имена всех выполняющихся потоков. Класс displayAllRunningThread наследует класс Thread, чтобы быть потоком, и определяет метод main(). В методе main() создается новый экземпляр класса displayAllRunningThread, и его имя устанавливается в "thread1" с помощью метода setName(). Затем метод start() запускает поток. После этого создается объект текущей группы потоков с помощью метода Thread.currentThread().getThreadGroup(). Затем получается количество активных потоков в текущей группе с помощью метода activeCount(), и создается массив Thread[] размером с количество потоков, чтобы сохранить их ссылки. Метод enumerate() заполняет массив lstThreads[] ссылками на все активные потоки в текущей группе. Наконец, цикл for перебирает все потоки и отображает их имя с помощью метода getName().
	*/
	public static void main(String[] args) {
		displayAllRunningThread t1 = new displayAllRunningThread();
		t1.setName("thread1");
		t1.start();
		ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
		int noThreads = currentGroup.activeCount();
		Thread[] lstThreads = new Thread[noThreads];
		currentGroup.enumerate(lstThreads);

		for (int i = 0; i < noThreads; i++) System.out.println("Thread No:" + i + " = " + lstThreads[i].getName());
	}
}
