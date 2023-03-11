package Threading;

public class getIdRunningThread extends Object implements Runnable {
	/*
Problem Description
How to get the Id of the running thread?

Solution
Following example demonstrates how to get the Id of a running thread using getThreadId() method.
Данный код на языке Java демонстрирует способ получения идентификатора (ID) текущего потока иллюстрирует работу класса ThreadLocal, который предоставляет переменную для каждого потока, сохраняя ее в локальном контексте.
В классе getIdRunningThread определен метод run(), который вызывается при запуске каждого потока. В этом методе с помощью объекта класса ThreadID, переданного в качестве параметра конструктору, вызывается метод getThreadID(), который возвращает идентификатор текущего потока. Затем в консоль выводится сообщение, содержащее идентификатор текущего потока. После этого происходит задержка выполнения потока на 2 секунды, и затем снова выводится сообщение с идентификатором текущего потока.
В классе getIdRunningThread также определен метод main(), в котором создаются 3 потока с именами "threadA", "threadB" и "threadC". Для каждого потока создается объект класса getIdRunningThread с передачей в конструктор объекта ThreadID. Затем каждый поток запускается методом start().
Класс ThreadID расширяет класс ThreadLocal и предоставляет уникальный идентификатор для каждого потока. В конструкторе класса ThreadID создается переменная nextID, которая будет использоваться для создания идентификаторов потоков. Метод getNewID() создает новый уникальный идентификатор, увеличивая значение переменной nextID на единицу и возвращая новый идентификатор. Метод initialValue() используется для инициализации начального значения переменной для каждого потока. Метод getThreadID() возвращает идентификатор потока.
Метод print() используется для вывода сообщения в консоль с именем текущего потока и переданным сообщением в качестве параметра.
	*/
	private ThreadID var;
	public getIdRunningThread(ThreadID v) {
		this.var = v;
	}
	public void run() {
		try {
			print("var getThreadID =" + var.getThreadID());
			Thread.sleep(2000);
			print("var getThreadID =" + var.getThreadID());
		} catch (InterruptedException x) {}
	}
	private static void print(String msg) {
		String name = Thread.currentThread().getName();
		System.out.println(name + ": " + msg);
	}
	public static void main(String[] args) {
		ThreadID tid = new ThreadID();
		getIdRunningThread shared = new getIdRunningThread(tid);
		try {
			Thread threadA = new Thread(shared, "threadA");
			threadA.start();
			Thread.sleep(500);

			Thread threadB = new Thread(shared, "threadB");
			threadB.start();
			Thread.sleep(500);

			Thread threadC = new Thread(shared, "threadC");
			threadC.start();
		} catch (InterruptedException x) {}
	}
}
class ThreadID extends ThreadLocal {
	private int nextID;
	public ThreadID() {
		nextID = 10001;
	}
	private synchronized Integer getNewID() {
		Integer id = new Integer(nextID);
		nextID++;
		return id;
	}
	protected Object initialValue() {
		print("in initialValue()");
		return getNewID();
	}
	public int getThreadID() {
		Integer id = (Integer) get();
		return id.intValue();
	}
	private static void print(String msg) {
		String name = Thread.currentThread().getName();
		System.out.println(name + ": " + msg);
	}
}
