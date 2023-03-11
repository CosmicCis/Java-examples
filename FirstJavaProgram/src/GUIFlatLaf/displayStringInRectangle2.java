package GUIFlatLaf;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
class MyCanvas extends JComponent {
	String s = "message";
	int x = 45;
	int y = 45;
	public void paint(Graphics g) {
		g.drawRect (10, 10, 200, 200);
		g.setColor(Color.red);
		g.drawString(s, x, y);
	}
}
public class displayStringInRectangle2 extends JPanel {
	/*
Problem Description
How to display string in a rectangle?

Solution
Following example demonstrates how to display each character in a rectangle by drawing a rectangle around each character using drawRect() method.
Этот код содержит два класса, MyCanvas и displayStringInRectangle2.

Класс MyCanvas является подклассом JComponent и содержит метод paint(), который рисует прямоугольник и выводит строку "message" внутри прямоугольника. Координаты x и y указывают, где находится строка внутри прямоугольника.

Класс displayStringInRectangle2 содержит метод main(), который создает экземпляр класса JFrame и добавляет экземпляр класса MyCanvas в качестве контента. Затем метод setVisible(true) устанавливает видимость окна и запускает приложение.

Таким образом, код отображает окно с прямоугольником и строкой "message", нарисованными внутри прямоугольника.
	*/
	public static void main(String[] a) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(30, 30, 300, 300);
		window.getContentPane().add(new MyCanvas());
		window.setVisible(true);
	}
}
