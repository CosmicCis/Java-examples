package Threading;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
public class solveDeadlockUsingThread extends ReentrantLock {
	/*
Problem Description
How to solve deadlock using thread?

Solution
Following example demonstrates how to solve deadlock using the concept of thread.
Приведенный код является примером того, как решить взаимоблокировку, используя концепцию потоков в Java.

Взаимоблокировки возникают, когда два или более потоков заблокированы в ожидании друг друга, и они не могут продолжить, потому что каждый из них ожидает ресурс, который удерживается другим.

Решение этой проблемы состоит в том, чтобы нарушить условие циклического ожидания, чего можно достичь, введя порядок получения блокировок. Другими словами, мы можем гарантировать, что все потоки получают блокировки в одном и том же порядке, что предотвратит циклические условия ожидания.

Предоставленный код реализует класс solveDeadlockUsingThread, который расширяет ReentrantLock. В нем есть список всех блокировок, которые используются в данный момент (deadlockLocksRegistry), список потоков, которые напряженно ожидают этой блокировки (hardwaitingThreads), и методы, позволяющие пометить потоки как напряженно ожидающие блокировки и освободить их из списка жесткого ожидания.

Метод lock() переопределяется, чтобы проверить, владеет ли текущий поток уже блокировкой. Если это произойдет, то он просто снимет блокировку и вернется. В противном случае он помечает текущий поток как напряженно ожидающий блокировки и проверяет, может ли он дождаться блокировки, не вызывая взаимоблокировки. Если это возможно, то он получает блокировку и освобождает поток из жесткого списка ожидания. Если это невозможно, то он выдает исключение DeadlockDetectedException.

Метод NewCondition() переопределяется для возврата нового объекта DeadlockDetectingCondition, который оборачивает исходный объект Condition, возвращаемый super.NewCondition(). Методы await() и signal() этого нового объекта помечают и освобождают потоки из жесткого списка ожидания соответственно.

Наконец, код предоставляет простой пример трех блокировок (a, b и c) и трех условий (wa, wb и wc), которые используются для создания взаимоблокировки. Код использует класс solveDeadlockUsingThread для получения блокировок и сигнальных условий, гарантируя, что блокировки будут получены в одинаковом порядке для всех потоков, и предотвращая возникновение взаимоблокировки.
	*/
	private static List deadlockLocksRegistry = new ArrayList();
	private static synchronized void registerLock(solveDeadlockUsingThread ddl) {
		if (!deadlockLocksRegistry.contains(ddl)) deadlockLocksRegistry.add(ddl);
	}
	private static synchronized void unregisterLock(solveDeadlockUsingThread ddl) {
		if (deadlockLocksRegistry.contains(ddl)) deadlockLocksRegistry.remove(ddl);
	}
	private List hardwaitingThreads = new ArrayList();
	private static synchronized void markAsHardwait(List l, Thread t) {
		if (!l.contains(t)) l.add(t);
	}
	private static synchronized void freeIfHardwait(List l, Thread t) {
		if (l.contains(t)) l.remove(t);
	}
	private static Iterator getAllLocksOwned(Thread t) {
		solveDeadlockUsingThread current;
		ArrayList results = new ArrayList();
		Iterator itr = deadlockLocksRegistry.iterator();

		while (itr.hasNext()) {
			current = (solveDeadlockUsingThread) itr.next();
			if (current.getOwner() == t)results.add(current);
		}
		return results.iterator();
	}
	private static Iterator getAllThreadsHardwaiting(solveDeadlockUsingThread l) {
		return l.hardwaitingThreads.iterator();
	}
	private static synchronized boolean canThreadWaitOnLock (
			Thread t,solveDeadlockUsingThread l) {

		Iterator locksOwned = getAllLocksOwned(t);
		while (locksOwned.hasNext()) {
			solveDeadlockUsingThread current = (solveDeadlockUsingThread) locksOwned.next();
			if (current == l)return false;
			Iterator waitingThreads = getAllThreadsHardwaiting(current);

			while (waitingThreads.hasNext()) {
				Thread otherthread = (Thread) waitingThreads.next();
				if (!canThreadWaitOnLock(otherthread, l)) {
					return false;
				}
			}
		}
		return true;
	}
	public solveDeadlockUsingThread() {
		this(false, false);
	}
	public solveDeadlockUsingThread(boolean fair) {
		this(fair, false);
	}
	private boolean debugging;
	public solveDeadlockUsingThread(boolean fair, boolean debug) {
		super(fair);
		debugging = debug;
		registerLock(this);
	}
	public void lock() {
		if (isHeldByCurrentThread()) {
			if (debugging)
				System.out.println("Already Own Lock");
			super.lock();
			freeIfHardwait(hardwaitingThreads,
					Thread.currentThread());
			return;
		}
		markAsHardwait(hardwaitingThreads, Thread.currentThread());
		if (canThreadWaitOnLock(Thread.currentThread(), this)) {
			if (debugging) System.out.println("Waiting For Lock");
			super.lock();
			freeIfHardwait(hardwaitingThreads, Thread.currentThread());

			if (debugging)System.out.println("Got New Lock");
		} else {
			throw new DeadlockDetectedException("DEADLOCK");
		}
	}
	public void lockInterruptibly() throws InterruptedException {
		lock();
	}
	public class DeadlockDetectingCondition implements Condition {
		Condition embedded;
		protected DeadlockDetectingCondition(ReentrantLock lock, Condition embedded) {
			this.embedded = embedded;
		}
		public void await() throws InterruptedException {
			try {
				markAsHardwait(hardwaitingThreads, Thread.currentThread());
				embedded.await();
			}
			finally {
				freeIfHardwait(hardwaitingThreads,
						Thread.currentThread());
			}
		}
		public void awaitUninterruptibly() {
			markAsHardwait(hardwaitingThreads, Thread.currentThread());
			embedded.awaitUninterruptibly();
			freeIfHardwait(hardwaitingThreads, Thread.currentThread());
		}
		public long awaitNanos(long nanosTimeout) throws InterruptedException {
			try {
				markAsHardwait(hardwaitingThreads,
						Thread.currentThread());
				return embedded.awaitNanos(nanosTimeout);
			}
			finally {
				freeIfHardwait(hardwaitingThreads,
						Thread.currentThread());
			}
		}
		public boolean await(long time, TimeUnit unit) throws InterruptedException {
			try {
				markAsHardwait(hardwaitingThreads, Thread.currentThread());
				return embedded.await(time, unit);
			}
			finally {
				freeIfHardwait(hardwaitingThreads, Thread.currentThread());
			}
		}
		public boolean awaitUntil(Date deadline) throws InterruptedException {
			try {
				markAsHardwait(hardwaitingThreads, Thread.currentThread());
				return embedded.awaitUntil(deadline);
			}
			finally {
				freeIfHardwait(hardwaitingThreads, Thread.currentThread());
			}
		}
		public void signal() {
			embedded.signal();
		}
		public void signalAll() {
			embedded.signalAll();
		}
	}
	public Condition newCondition() {
		return new DeadlockDetectingCondition(this, super.newCondition());
	}
	private static Lock a = new solveDeadlockUsingThread(false, true);
	private static Lock b = new solveDeadlockUsingThread(false, true);
	private static Lock c = new solveDeadlockUsingThread(false, true);

	private static Condition wa = a.newCondition();
	private static Condition wb = b.newCondition();
	private static Condition wc = c.newCondition();
	private static void delaySeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException ex) {}
	}
	private static void awaitSeconds(Condition c, int seconds) {
		try {
			c.await(seconds, TimeUnit.SECONDS);
		} catch (InterruptedException ex) {}
	}
	private static void testOne() {
		new Thread(new Runnable() {
			public void run() {
				System.out.println("thread one grab a");
				a.lock();
				delaySeconds(2);
				System.out.println("thread one grab b");
				b.lock();
				delaySeconds(2);
				a.unlock();
				b.unlock();
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				System.out.println("thread two grab b");
				b.lock();
				delaySeconds(2);
				System.out.println("thread two grab a");
				a.lock();
				delaySeconds(2);
				a.unlock();
				b.unlock();
			}
		}).start();
	}
	private static void testTwo() {
		new Thread(new Runnable() {
			public void run() {
				System.out.println("thread one grab a");
				a.lock();
				delaySeconds(2) ;
				System.out.println("thread one grab b");
				b.lock();
				delaySeconds(10);
				a.unlock();
				b.unlock();
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				System.out.println("thread two grab b");
				b.lock();
				delaySeconds(2);
				System.out.println("thread two grab c");
				c.lock();
				delaySeconds(10);
				b.unlock();
				c.unlock();
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				System.out.println("thread three grab c");
				c.lock();
				delaySeconds(4);
				System.out.println("thread three grab a");
				a.lock();
				delaySeconds(10);
				c.unlock();
				a.unlock();
			}
		}).start();
	}
	private static void testThree() {
		new Thread(new Runnable() {
			public void run() {
				System.out.println("thread one grab b");
				b.lock();
				System.out.println("thread one grab a");
				a.lock();
				delaySeconds(2);
				System.out.println("thread one waits on b");
				awaitSeconds(wb, 10);
				a.unlock();
				b.unlock();
			}
		}).start();
		new Thread(new Runnable() {
			public void run() {
				delaySeconds(1);
				System.out.println("thread two grab b");
				b.lock();
				System.out.println("thread two grab a");
				a.lock();
				delaySeconds(10);
				b.unlock();
				c.unlock();
			}
		}).start();
	}
	public static void main(String args[]) {
		int test = 1;
		if (args.length > 0) test = Integer.parseInt(args[0]);
		switch (test) {
			case 1:
				testOne();
				break;
			case 2:
				testTwo();
				break;
			case 3:
				testThree();
				break;
			default:
				System.err.println("usage: java solveDeadlockUsingThread [ test# ]");
		}
		delaySeconds(60);
		System.out.println("--- End Program ---");
		System.exit(0);
	}
}
class DeadlockDetectedException extends RuntimeException {
	public DeadlockDetectedException(String s) {
		super(s);
	}
}
