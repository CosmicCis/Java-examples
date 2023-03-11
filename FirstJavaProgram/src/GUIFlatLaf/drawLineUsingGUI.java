package GUIFlatLaf;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import javax.swing.JApplet;
import javax.swing.JFrame;
public class drawLineUsingGUI extends JApplet {
	/*
Problem Description
How to draw a line using GUI?

Solution
Following example demonstrates how to draw a line using draw() method of Graphics2D class with Line2D object as an argument.
Этот код на языке Java рисует линию на экране, используя графический интерфейс пользователя (GUI).
Класс drawLineUsingGUI наследуется от класса JApplet, что позволяет создать апплет для рисования линии на экране.
Метод init() устанавливает цвет фона и цвет переднего плана на белый цвет.
Метод paint(Graphics g) создает объект Graphics2D для рисования графики с использованием антиалиасинга. Затем он устанавливает цвет на серый, выбирает координаты точки начала линии (x, y), и рисует линию с помощью объекта Line2D.Double. Затем он выводит текст "Line" в координатах (x, 250) на экран.
Метод main(String s[]) создает новый фрейм (окно), добавляет обработчик событий для закрытия окна, создает новый экземпляр класса drawLineUsingGUI, устанавливает его в центре окна и устанавливает его размер в 300х300 пикселей, после чего выводит окно на экран с помощью метода setVisible(true).
	*/
	public void init() {
		setBackground(Color.white);
		setForeground(Color.white);
	}
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setPaint(Color.gray);
		int x = 5;
		int y = 7;
		g2.draw(new Line2D.Double(x, y, 200, 200));
		g2.drawString("Line", x, 250);
	}
	public static void main(String s[]) {
		JFrame f = new JFrame("Line");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		JApplet applet = new drawLineUsingGUI();
		f.getContentPane().add("Center", applet);
		applet.init();

		f.pack();
		f.setSize(new Dimension(300, 300));
		f.setVisible(true);
	}
}
