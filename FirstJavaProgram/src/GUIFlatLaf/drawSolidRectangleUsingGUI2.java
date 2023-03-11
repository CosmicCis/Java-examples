package GUIFlatLaf;

import javax.swing.*;
import java.awt.*;

public class drawSolidRectangleUsingGUI2 extends JPanel {
	/*
Problem Description
How to draw a solid rectangle using GUI?

Solution
Following example demonstrates how to display a solid rectangle using fillRect() method of Graphics class.
Данный код отображает на экране прямоугольник, закрашенный цветом, используя метод fillRect() класса Graphics.

В классе drawSolidRectangleUsingGUI2 определен метод paintComponent(), который переопределяет метод родительского класса JPanel. Метод вызывает метод родительского класса, а затем создает объект класса Graphics2D и устанавливает цвет с помощью метода setColor(). Затем он вызывает метод fillRect() с координатами (250, 195), шириной 90 и высотой 60, чтобы отобразить закрашенный прямоугольник на экране.

В методе main() создается объект Panel, создается и настраивается объект JFrame, добавляется на него объект Panel, устанавливается размер и положение окна и отображается на экране.
	*/
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(new Color(187, 23, 48));
		g2d.fillRect(250, 195, 90, 60);
	}
	public static void main(String[] args) {
		Panel rects = new Panel();
		JFrame frame = new JFrame("Rectangles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(rects);
		frame.setSize(360, 300);
		// Центрирование окна
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
