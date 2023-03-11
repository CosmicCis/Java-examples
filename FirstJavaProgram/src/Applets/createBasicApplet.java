package Applets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.formdev.flatlaf.FlatLightLaf;
public class createBasicApplet extends Applet {
	/*
Problem Description
How to create a basic Applet?
Solution
Following example demonstrates how to create a basic Applet by extending Applet Class. You will need to embed another HTML code to run this program.
Этот код на языке Java создает простое приложение типа Applet (веб-приложение, которое запускается в браузере) путем расширения класса Applet.

В методе paint() определяется, что должно отображаться на экране при запуске приложения. В данном случае, используя графический контекст (Graphics), выводится сообщение "Welcome in Java Applet." в координатах (40, 20).

В методе main() создается объект класса createBasicApplet (это наше приложение), а затем создается объект типа Frame (окно приложения). Мы используем библиотеку FlatLaf для настройки внешнего вида нашего окна в стиле Flat.

Далее создается кнопка "Close", которая будет закрывать окно приложения, если на нее нажать. Мы добавляем слушатель событий (ActionListener), который реагирует на нажатие этой кнопки, вызывая метод dispose() у объекта Frame, который закрывает окно.

Мы добавляем наше приложение (createBasicApplet) в центр окна (BorderLayout.CENTER), а кнопку "Close" - внизу окна (BorderLayout.SOUTH). Размер окна устанавливается на 200x200 пикселей.

Затем мы вычисляем центр экрана и устанавливаем позицию окна так, чтобы оно располагалось по центру экрана.

После этого мы вызываем методы init() и start() у объекта createBasicApplet, чтобы начать выполнение приложения. Метод init() инициализирует приложение, а метод start() запускает его.

Наконец, мы делаем окно видимым, вызывая метод setVisible(true). Теперь наше приложение может быть запущено в любом совместимом браузере, включая и внутри нашего Java-приложения.
	*/
	public void paint(Graphics g) {
		g.drawString("Welcome in Java Applet.",40,20);
	}
	public static void main(String[] args) {
		createBasicApplet applet = new createBasicApplet();
		FlatLightLaf.setup();
		Frame frame = new Frame("Applet Window");

		// Create a button to close the applet
		Button closeButton = new Button("Close");
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); // Close the frame and exit the app
			}
		});

		frame.add(applet, BorderLayout.CENTER);
		frame.add(closeButton, BorderLayout.SOUTH);
		frame.setSize(200, 200);

		// Center the window on the screen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int centerX = (int) screenSize.getWidth() / 2;
		int centerY = (int) screenSize.getHeight() / 2;
		int frameWidth = frame.getSize().width;
		int frameHeight = frame.getSize().height;
		frame.setLocation(centerX - frameWidth / 2, centerY - frameHeight / 2);

		applet.init();
		applet.start();
		frame.setVisible(true);
	}
}