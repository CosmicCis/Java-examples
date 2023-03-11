package Threading;
class displayThreadStatus1 extends Thread {
	boolean waiting = true;
	boolean ready = false;
	displayThreadStatus1() {
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
public class displayThreadStatus {
	/*
Problem Description
How to display thread status?

Solution
Following example demonstrates how to display different status of thread using isAlive() & getStatus() methods of Thread.
Класс displayThreadStatus1 наследуется от класса Thread и имеет два булевых поля: waiting и ready. Поля инициализируются значением true и false соответственно. В методе run() происходит бесконечный цикл, в котором каждую итерацию выводится на экран строка "waiting:true". Затем вызывается метод startWait(), который с помощью метода wait() блокирует выполнение потока, пока значение поля ready не станет равным true. После этого метод run() завершается.
Метод startWait() синхронизирован и также содержит вызов метода wait(), пока значение поля ready не изменится. Когда это происходит, метод notice() устанавливает значение поля ready в true и вызывает метод notify(), который оповещает все потоки, ожидающие блокировку данного объекта.
Класс displayThreadStatus содержит метод main(), в котором создается экземпляр класса displayThreadStatus1, который затем выводится на экран при помощи метода showThreadStatus(), где проверяется его статус с помощью методов isAlive() и getState(). После этого поток запускается методом start() и снова выводится его статус. Далее значение поля waiting устанавливается в false и снова выводится статус потока. Затем значение поля ready устанавливается в true и оповещается методом notice(). В конце метода main() выводится статус потока при помощи метода isAlive() до тех пор, пока поток не завершится, после чего выводится его окончательный статус.
	*/
	public static void main(String args[]) throws Exception {
		displayThreadStatus1 thrd = new displayThreadStatus1();
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
		System.out.println(thrd.getName()+" Alive:"+thrd.isAlive()+" State:" + thrd.getState() );
	}
}
