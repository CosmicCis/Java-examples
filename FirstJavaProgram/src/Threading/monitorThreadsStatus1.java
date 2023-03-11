package Threading;
class monitorThreadsStatus extends Thread {
	boolean waiting = true;
	boolean ready = false;
	monitorThreadsStatus() {
	}
	public void run() {
		String thrdName = Thread.currentThread().getName();
		System.out.println(thrdName + " starting.");
		while(waiting) System.out.println("waiting:"+waiting);
		System.out.println("waiting...");
		startWait();
		try {
			Thread.sleep(1000);
		} catch(Exception exc) {
			System.out.println(thrdName + " interrupted.");
		}
		System.out.println(thrdName + " terminating.");
	}
	synchronized void startWait() {
		try {
			while(!ready) wait();
		} catch(InterruptedException exc) {
			System.out.println("wait() interrupted");
		}
	}
	synchronized void notice() {
		ready = true;
		notify();
	}
}
public class monitorThreadsStatus1 {
	/*
Problem Description
How to monitor a thread's status?

Solution
Following example demonstrates how to monitor a thread's status by extending Thread class and using currentThread.getName() method.
Код на языке Java, который демонстрирует мониторинг статуса потока.

Класс monitorThreadsStatus наследует класс Thread и имеет два логических поля waiting и ready. В методе run() происходит бесконечный цикл, который выводит сообщения о том, что поток ждет, пока его состояние не изменится. Затем вызывается метод startWait(), который ожидает, пока поле ready не станет истинным, а затем выводит сообщение о завершении потока.

Методы startWait() и notice() являются синхронизированными и используются для изменения состояния поля ready и уведомления потока, который вызывал метод wait().

Класс monitorThreadsStatus1 содержит метод main(), который создает экземпляр класса monitorThreadsStatus, устанавливает его имя и выводит его текущее состояние. Затем поток запускается и ждет некоторое время. После этого состояние потока изменяется путем установки поля waiting в false и вызова метода notice(). После некоторой задержки состояние потока выводится на экран, а затем цикл ожидания завершается, когда поток thrd завершится.

Метод showThreadStatus() используется для вывода текущего состояния потока, включая его имя, флаг isAlive() и состояние getState().

Короче говоря, этот код демонстрирует, как мониторить состояние потока и уведомлять другие потоки о его завершении.
	*/
	public static void main(String[] args) throws Exception {
		monitorThreadsStatus thrd = new monitorThreadsStatus();
		thrd.setName("MyThread #1");
		showThreadStatus(thrd);
		thrd.start();

		Thread.sleep(50);
		showThreadStatus(thrd);
		thrd.waiting = false;

		Thread.sleep(50);
		showThreadStatus(thrd);
		thrd.notice();

		Thread.sleep(50);
		showThreadStatus(thrd);

		while(thrd.isAlive())
			System.out.println("alive");
		showThreadStatus(thrd);
	}
	static void showThreadStatus(Thread thrd) {
		System.out.println(thrd.getName()+"  Alive:="+thrd.isAlive()+" State:=" + thrd.getState() );
	}
}
