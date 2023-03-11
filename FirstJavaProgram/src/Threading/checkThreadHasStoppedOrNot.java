package Threading;

public class checkThreadHasStoppedOrNot {
	/*
Problem Description
How to check a thread has stopped or not?

Solution
Following example demonstrates how to check a thread has stop or not by checking with isAlive() method.
Данный код на языке Java позволяет проверить, закончился ли выполнение потока или нет.

Код содержит два класса: основной класс checkThreadHasStoppedOrNot и дочерний класс MyThread, который расширяет функциональность потока.

В методе main создается экземпляр потока thread на основе класса MyThread и запускается с помощью метода start(). Затем выполняется проверка статуса потока с помощью метода isAlive(). Если isAlive() возвращает true, то это означает, что поток еще не завершен. В таком случае на экран выводится сообщение "Thread has not finished" (Поток еще не завершен), иначе выводится сообщение "Finished" (Завершено).

Затем выполняется метод join() с задержкой в 5000 миллисекунд, который ожидает завершения потока в течение указанного времени. Если поток не завершится за указанное время, то выводится сообщение "thread has not finished" (Поток еще не завершен), иначе - "Finished".

В конце метод join() вызывается еще раз без задержки, чтобы дождаться полного завершения потока.

Класс MyThread содержит метод run(), который содержит бесконечный цикл. Внутри цикла происходит проверка переменной stop. Если она истинна, то цикл завершается с помощью оператора return, а выполнение потока останавливается. Если stop ложно, то цикл продолжается бесконечно, и поток не завершится.

Таким образом, в этом коде происходит запуск потока, проверка его статуса, ожидание его завершения и проверка статуса еще раз. Класс MyThread позволяет создать поток с бесконечным циклом, который может быть остановлен путем установки переменной stop в истину.
	*/
	public static void main(String[] argv)throws Exception {
		Thread thread = new MyThread();
		thread.start();

		if (thread.isAlive()) {
			System.out.println("Thread has not finished");
		} else {
			System.out.println("Finished");
		}
		long delayMillis = 5000;
		thread.join(delayMillis);

		if (thread.isAlive()) {
			System.out.println("thread has not finished");
		} else {
			System.out.println("Finished");
		}
		thread.join();
	}
}
class MyThread extends Thread {
	boolean stop = false;
	public void run() {
		while (true) {
			if (stop) {
				return;
			}
		}
	}
}
