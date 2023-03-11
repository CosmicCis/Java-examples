package Threading;

public class interruptRunningThread extends Object implements Runnable {
	/*
Problem Description
How to interrupt a running Thread?

Solution
Following example demonstrates how to interrupt a running thread interrupt() method of thread and check if a thread is interrupted using isInterrupted() method.
Данный код демонстрирует, как прервать работу потока в Java. Для этого создается класс interruptRunningThread, который реализует интерфейс Runnable. В методе run() класса interruptRunningThread вызывается метод work2(), который содержит бесконечный цикл с условием проверки на прерывание потока с помощью метода isInterrupted(). Если поток прерывается, то в методе work2() делается пауза в 2 секунды, а затем снова проверяется условие прерывания.
В методе work() также есть бесконечный цикл, в котором происходит вычисление и проверка на прерывание с помощью метода interrupted(). Если поток прерывается, то генерируется исключение InterruptedException.
В методе main() создается объект класса interruptRunningThread и запускается новый поток с помощью конструктора класса Thread, передавая ему объект interruptRunningThread. После запуска потока основной поток засыпает на 2 секунды. Затем основной поток прерывает запущенный поток с помощью метода interrupt(). После этого основной поток завершается. Если запущенный поток прерывается, то выводится сообщение об этом, и метод run() завершается. Если же поток не прерывается, то выводятся сообщения об этом, а метод run() продолжает свою работу.
	*/
	public void run() {
		try {
			System.out.println("in run() - about to work2()");
			work2();
			System.out.println("in run() - back from work2()");
		} catch (InterruptedException x) {
			System.out.println("in run() - interrupted in work2()");
			return;
		}
		System.out.println("in run() - doing stuff after nap");
		System.out.println("in run() - leaving normally");
	}
	public void work2() throws InterruptedException {
		while (true) {
			if (Thread.currentThread().isInterrupted()) {
				System.out.println("C isInterrupted()="+ Thread.currentThread().isInterrupted());
				Thread.sleep(2000);
				System.out.println("D isInterrupted()="+ Thread.currentThread().isInterrupted());
			}
		}
	}
	public void work() throws InterruptedException {
		while (true) {
			for (int i = 0; i < 100000; i++) {
				int j = i * 2;
			}
			System.out.println("A isInterrupted()="+ Thread.currentThread().isInterrupted());
			if (Thread.interrupted()) {
				System.out.println("B isInterrupted()="+ Thread.currentThread().isInterrupted());
				throw new InterruptedException();
			}
		}
	}
	public static void main(String[] args) {
		interruptRunningThread si = new interruptRunningThread();
		Thread t = new Thread(si);
		t.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException x) { }

		System.out.println("in main() - interrupting other thread");
		t.interrupt();
		System.out.println("in main() - leaving");
	}
}
