package GUIFlatLaf;
import java.awt.*;
import javax.swing.*;
public class displayStringInRectangle extends JPanel {
	/*
Problem Description
How to display string in a rectangle?

Solution
Following example demonstrates how to display each character in a rectangle by drawing a rectangle around each character using drawRect() method.
Данный код на Java является примером решения задачи "Как отобразить строку в прямоугольнике?".
Класс displayStringInRectangle наследует класс JPanel, который является компонентом пользовательского интерфейса для отрисовки графики. В методе paint() создается и отображается строка в прямоугольниках.
Сначала задается шрифт и его размер. Затем для каждого символа в строке создается прямоугольник с помощью метода drawRect(), который принимает координаты x, y, ширину и высоту. Затем символ выводится внутри прямоугольника методом drawString(). Координаты x и y для следующего символа вычисляются путем добавления ширины символа к текущей координате x.
В методе main() создается объект класса JFrame, который представляет главное окно приложения, и устанавливаются его свойства: заголовок, размер, содержимое. Затем главное окно делается видимым с помощью метода setVisible().
	*/
	public void paint(Graphics g) {
		g.setFont(new Font("",0,100));
		FontMetrics fm = getFontMetrics(new Font("",0,100));
		String s = "message";
		int x = 5;
		int y = 5;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int h = fm.getHeight();
			int w = fm.charWidth(c);

			g.drawRect(x, y, w, h);
			g.drawString(String.valueOf(c), x, y + h);
			x = x + w;
		}
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new displayStringInRectangle());
		frame.setSize(500, 700);
		// Центрирование окна
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
