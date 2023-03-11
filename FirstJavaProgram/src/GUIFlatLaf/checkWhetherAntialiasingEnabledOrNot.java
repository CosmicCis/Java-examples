package GUIFlatLaf;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;
import javax.swing.JFrame;
public class checkWhetherAntialiasingEnabledOrNot {
	/*
Problem Description
How to check whether antialiasing is enabled or not?

Solution
Following example demonstrates how to check if antialiasing is turned on or not using RenderingHints Class.
Данный код написан на языке программирования Java и предназначен для проверки включена ли опция сглаживания (antialiasing) в объекте Graphics2D, который используется для отображения графических элементов в окне приложения.

При запуске программы создается объект JFrame, на котором размещается экземпляр класса MyComponent. Класс MyComponent является наследником класса JComponent и переопределяет метод paint, который отвечает за отображение графики на компоненте.

В методе paint сначала вызывается метод getRenderingHints объекта Graphics2D, который возвращает текущие параметры отрисовки графики. Затем проверяется, содержит ли объект RenderingHints значение RenderingHints.VALUE_ANTIALIAS_ON, которое указывает, включена ли опция сглаживания.

Результат проверки выводится на консоль. Далее, если опция сглаживания не была включена, она включается с помощью метода setRenderingHint.

Таким образом, данный код позволяет проверить, включена ли опция сглаживания в объекте Graphics2D и, если она не включена, включить ее.
	*/
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.add(new MyComponent());
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
class MyComponent extends JComponent {
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		RenderingHints rh = g2.getRenderingHints();
		boolean bl = rh.containsValue (RenderingHints.VALUE_ANTIALIAS_ON);
		System.out.println(bl);
		g2.setRenderingHint(
				RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	}
}