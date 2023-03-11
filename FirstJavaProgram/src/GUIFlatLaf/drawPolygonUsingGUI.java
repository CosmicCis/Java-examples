package GUIFlatLaf;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class drawPolygonUsingGUI extends JPanel {
	/*
Problem Description
How to draw a polygon using GUI?

Solution
Following example demonstrates how to draw a polygon by creating Polygon() object. addPoint() & drawPolygon() method is used to draw the Polygon.
Данный код на языке Java создает графический интерфейс для рисования многоугольника.
В классе drawPolygonUsingGUI определен метод paintComponent, который вызывается автоматически при отрисовке объекта. Внутри метода создается объект класса Polygon, в который добавляются точки многоугольника с помощью метода addPoint(). В данном случае точки задаются в цикле по формулам для равномерного распределения точек по окружности.
После задания точек многоугольника, метод drawPolygon() вызывается с передачей объекта Polygon в качестве аргумента для отрисовки многоугольника на графическом контексте g.
В методе main() создается объект класса JFrame для отображения окна с нарисованным многоугольником. Устанавливается заголовок окна и его размер, а также устанавливается обработчик закрытия окна. Затем созданный объект drawPolygonUsingGUI добавляется на контейнер contentPane окна, который заполняет всю доступную площадь окна. И наконец, окно делается видимым с помощью метода setVisible().
	*/
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Polygon p = new Polygon();
		for (int i = 0; i < 5; i++) p.addPoint((int) (
				100 + 50 * Math.cos(i * 2 * Math.PI / 5)),(int) (100 + 50 * Math.sin(
				i * 2 * Math.PI / 5)));
		g.drawPolygon(p);
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Polygon");
		frame.setSize(350, 250);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		Container contentPane = frame.getContentPane();
		contentPane.add(new drawPolygonUsingGUI());
		frame.setVisible(true);
	}
}
