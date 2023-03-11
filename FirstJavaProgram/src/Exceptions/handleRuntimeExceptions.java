package Exceptions;

public class handleRuntimeExceptions {
	/*
Problem Description
How to handle runtime exceptions?

Solution
This example shows how to handle the runtime exception in a java programs.

Exception in thread "main" java.lang.RuntimeException: From f()
	at Exceptions.handleRuntimeExceptions.f(handleRuntimeExceptions.java:12)
	at Exceptions.handleRuntimeExceptions.g(handleRuntimeExceptions.java:15)
	at Exceptions.handleRuntimeExceptions.main(handleRuntimeExceptions.java:18)
Данное сообщение об ошибке указывает на то, что возникло исключение типа RuntimeException, которое было выброшено в методе f() (строка 12), а затем перехвачено в методе g() (строка 15) и передано в метод main() (строка 18).
Как можно видеть из кода, метод f() выбрасывает исключение типа RuntimeException с сообщением "From f()", когда он вызывается. Метод g() вызывает метод f(), поэтому при запуске метода main() возникает исключение, так как метод f() выбрасывает исключение, которое не было обработано.
Таким образом, программа показывает, как возникают исключения типа RuntimeException в Java и как их можно перехватывать и обрабатывать.

	 */
	static void f() {
		throw new RuntimeException("From f()");
	}
	static void g() {
		f();
	}
	public static void main(String[] args) {
		g();
	}
}
