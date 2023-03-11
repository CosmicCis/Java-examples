package GUIFlatLaf;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class drawTextUsingGUI extends JPanel {
	/*
Problem Description
How to draw text using GUI?

Solution
Following example demonstrates how to draw text drawString(), setFont() methods of Graphics class.
Данный код на Java позволяет рисовать текст на экране при помощи графического интерфейса пользователя (GUI).

В методе paint создается объект Graphics2D из Graphics, чтобы использовать методы и свойства Graphics2D. Затем с помощью метода setRenderingHint() включается сглаживание краев для графики.

Далее создается объект шрифта типа Font с названием "Serif", обычным стилем и размером 96 пикселей. Затем этот шрифт устанавливается для объекта Graphics2D при помощи метода setFont().

Наконец, метод drawString() вызывается на объекте Graphics2D, чтобы нарисовать строку "Text" в координатах (40, 120) на экране.

В методе main создается окно JFrame и добавляется объект drawTextUsingGUI в его контентную панель. Затем устанавливается размер окна и его видимость. Когда окно закрывается, приложение также завершается.
	*/
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setRenderingHint(
				RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		Font font = new Font("Serif", Font.PLAIN, 96);
		g2.setFont(font);
		g2.drawString("Text", 40, 120);
	}
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().add(new drawTextUsingGUI());
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
