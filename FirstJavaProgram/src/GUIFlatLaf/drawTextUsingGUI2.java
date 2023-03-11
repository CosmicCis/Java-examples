package GUIFlatLaf;

import javax.swing.*;
import java.awt.*;

public class drawTextUsingGUI2 extends JPanel {
	/*
Problem Description
How to draw text using GUI?

Solution
Following example demonstrates how to draw text drawString(), setFont() methods of Graphics class.
Этот код содержит пример использования методов класса Graphics для рисования текста на панели с помощью графического интерфейса (GUI).

Класс drawTextUsingGUI2 наследуется от класса JPanel, который предоставляет прямоугольную область для рисования компонентов. Метод paint переопределяется для рисования текста "GitHub" на панели с помощью объекта Graphics2D.

Перед началом рисования текста, метод setRenderingHint устанавливает параметры рендеринга для графического контекста, включая параметр антиалиасинга, который делает границы шрифта более плавными. Затем создается объект шрифта Font, используя параметры типа шрифта, размера и стиля, и устанавливается с помощью метода setFont. Наконец, метод drawString рисует текст "GitHub" на панели с помощью текущего шрифта и координат (40, 120).

В методе main создается объект класса JFrame, добавляется объект Panel на его контентную панель, устанавливается размер окна и делается видимым.
	*/
	public void paint(Graphics gr) {
		Graphics2D g = (Graphics2D)gr;
		g.setRenderingHint(
				RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		Font font = new Font("Serif", Font.PLAIN, 96);
		g.setFont(font);
		g.drawString("GitHub", 40, 120);
	}
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().add(new Panel());
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
