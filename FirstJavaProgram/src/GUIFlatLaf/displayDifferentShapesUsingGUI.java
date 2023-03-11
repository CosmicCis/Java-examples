package GUIFlatLaf;

import java.awt.Shape;
import java.awt.geom.*;

public class displayDifferentShapesUsingGUI {
	/*
Problem Description
How to display different shapes using GUI?

Solution
Following example demonstrates how to display different shapes using Arc2D, Ellipse2D, Rectangle2D, RoundRectangle2D classes.
Этот код создает различные геометрические фигуры, используя классы Shape, Arc2D, Ellipse2D, Rectangle2D и RoundRectangle2D. В методе main определены различные параметры, такие как координаты, ширина, высота, начальный угол и т.д., которые используются для создания объектов различных классов. Затем в консоль выводится сообщение о создании различных фигур. Однако, не происходит фактического отображения фигур, так как отсутствует код для создания GUI и рисования на нем. Этот код скорее является примером создания объектов различных классов фигур, которые могут быть использованы в более продвинутых программах для отображения графики.
	*/
	public static void main(String[] args) {
		int x1 = 1, x2 = 2, w = 3, h = 4,
				x = 5, y = 6,
				y1 = 1, y2 = 2, start = 3;

		Shape line = new Line2D.Float(x1, y1, x2, y2);
		Shape arc = new Arc2D.Float(x, y, w, h, start, 1, 1);
		Shape oval = new Ellipse2D.Float(x, y, w, h);
		Shape rectangle = new Rectangle2D.Float(x, y, w, h);
		Shape roundRectangle = new RoundRectangle2D.Float (x, y, w, h, 1, 2);
		System.out.println("Different shapes are created:");
	}
}
