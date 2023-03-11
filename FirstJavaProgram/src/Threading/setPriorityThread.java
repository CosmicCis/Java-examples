package Threading;

public class setPriorityThread {
	/*
Problem Description
How to set the priority of a thread?

Solution
Following example how to set the priority of a thread with the help of.
Данный код на языке Java демонстрирует, как задать приоритет для потоков.
В методе main создаются два объекта типа Thread, которые соответствуют потокам. Затем для первого потока устанавливается максимальный приоритет (MAX_PRIORITY), а для второго потока - минимальный приоритет (MIN_PRIORITY) с помощью метода setPriority().
Затем оба потока запускаются с помощью метода start(). После этого с помощью методов join() для каждого из потоков дожидаемся их завершения.
После завершения работы обоих потоков на экран выводится сообщение "The priority has been set.". Это говорит о том, что задание приоритета потокам было выполнено успешно.
	*/
	public static void main(String[] args) throws Exception {
		Thread thread1 = new Thread();
		Thread thread2 = new Thread();
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.println("The priority has been set.");
	}
}
