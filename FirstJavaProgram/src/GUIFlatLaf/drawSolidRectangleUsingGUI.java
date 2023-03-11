package GUIFlatLaf;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class drawSolidRectangleUsingGUI extends JPanel {
	/*
Problem Description
How to draw a solid rectangle using GUI?

Solution
Following example demonstrates how to display a solid rectangle using fillRect() method of Graphics class.
Данный код на Java представляет собой пример создания графического интерфейса пользователя (GUI) для рисования простой закрашенной прямоугольной фигуры. Он использует библиотеку AWT (Abstract Window Toolkit) и Swing для создания окна приложения и панели, на которой рисуется фигура.

Класс drawSolidRectangleUsingGUI наследуется от класса JPanel, который является контейнером для компонентов интерфейса. Он переопределяет метод paint(), который вызывается автоматически, когда компонент рисуется на экране. В методе paint() используется метод fillRect() объекта Graphics, чтобы закрасить прямоугольник на экране. Затем создается экземпляр класса JFrame, задается его размер, добавляется на панель созданный объект drawSolidRectangleUsingGUI, задается действие при закрытии окна и делается окно видимым с помощью метода setVisible().

После запуска данного кода отобразится окно размером 400x400 пикселей с закрашенным прямоугольником внутри него.
	*/
	public static void main(String[] a) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		f.add(new drawSolidRectangleUsingGUI());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Центрирование окна
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
	public void paint(Graphics g) {
		g.fillRect (5, 15, 50, 75);
	}
}
