package Threading;

public class checkPriorityLevelOfThread {
	/*
Problem Description
How to check priority level of a thread?

Solution
Following example demonstrates how to check priority level of a thread using getPriority() method of a Thread.
Данный код предназначен для демонстрации получения приоритета потоков. В методе makeRunnable() создается объект типа Runnable, который выводит в консоль приоритет и имя текущего потока. В методе main() сначала выводится приоритет и имя текущего потока, затем создается и запускается новый поток threadA, созданный на основе объекта Runnable, созданного ранее в методе makeRunnable(). После этого происходит пауза в главном потоке на 3 секунды, чтобы убедиться, что поток threadA успел запуститься и что вывод в консоль производится из него. Затем выводится приоритет потока threadA с помощью метода getPriority(). Вывод в консоль содержит информацию о приоритете и имени текущего потока или потока threadA.
	*/
	private static Runnable makeRunnable() {
		Runnable r = new Runnable() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					Thread t = Thread.currentThread();
					System.out.println("in run() - priority = " + t.getPriority()+ ", name = " + t.getName());
					try {
						Thread.sleep(2000);
					} catch (InterruptedException x) {}
				}
			}
		};
		return r;
	}
	public static void main(String[] args) {
		System.out.println(
				"in main() - Thread.currentThread(). getPriority() = " + Thread.currentThread().getPriority());
		System.out.println(
				"in main() - Thread.currentThread().getName() = "+ Thread.currentThread().getName());

		Thread threadA = new Thread(makeRunnable(), "threadA");
		threadA.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException x) {}
		System.out.println("in main() - threadA.getPriority() = " + threadA.getPriority());
	}
}
