package Threading;
import java.util.Timer;
import java.util.TimerTask;
class stopThreadFoWhile1 extends Thread {
	private volatile boolean stop = false;
	private int counter = 0;

	public void run() {
		while (!stop && counter < 10000) {
			System.out.println(counter++);
		}
		if (stop)
			System.out.println("Detected stop");
	}
	public void requestStop() {
		stop = true;
	}
}
public class stopThreadFoWhile {
	/*
Problem Description
How to stop a thread for a while?

Solution
Following example demonstates how to stop a thread by creating an user defined method run() taking the help of Timer classes' methods.
Данный код на языке Java представляет собой пример остановки потока с помощью флага. В классе stopThreadFoWhile1 создается новый поток, который выполняется в методе run(). В цикле while проверяется, что флаг stop не установлен и значение счетчика counter меньше 10000. При каждой итерации цикла выводится значение счетчика в консоль, после чего счетчик увеличивается на единицу. Если поток был остановлен с помощью метода requestStop(), то в консоль выводится сообщение "Detected stop".
В методе main() создается новый объект класса stopThreadFoWhile1, который запускается методом start(). Затем создается объект класса Timer, который запускает метод run() объекта класса TimerTask через 350 миллисекунд. В методе run() объекта класса TimerTask вызывается метод requestStop() объекта класса stopThreadFoWhile1, что приводит к остановке потока.
Таким образом, код демонстрирует простой способ остановки потока с помощью флага и использование класса Timer для задержки остановки потока.
	*/
	public static void main(String[] args) {
		final stopThreadFoWhile1 stoppable = new stopThreadFoWhile1();
		stoppable.start();

		new Timer(true).schedule(new TimerTask() {
			                         public void run() {
				                         System.out.println("Requesting stop");
				                         stoppable.requestStop();
			                         }
		                         },
				350);
	}
}