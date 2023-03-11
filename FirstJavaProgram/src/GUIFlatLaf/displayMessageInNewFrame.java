package GUIFlatLaf;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class displayMessageInNewFrame extends JPanel {
	/*
Problem Description
How to display a message in a new frame?

Solution
Following example demonstrates how to display message in a new frame by creating a frame using JFrame() & using JFrames getContentPanel(), setSize() & setVisible() methods to display this frame.
Данный код демонстрирует, как отобразить сообщение в новом окне с помощью создания фрейма и использования методов getContentPanel(), setSize() и setVisible() класса JFrame.
Класс displayMessageInNewFrame наследуется от JPanel и переопределяет метод paint() для отрисовки сообщения "Java Source and Support" по центру окна. В методе paint() используется класс Graphics2D для настройки антиалиасинга, установки шрифта и отрисовки текста. Метод paintHorizontallyCenteredText() используется для нахождения центра текста и отрисовки его по горизонтальной оси.
В методе main() создается экземпляр класса JFrame, добавляется экземпляр класса displayMessageInNewFrame на его панель содержимого с помощью метода getContentPane(), устанавливается размер фрейма с помощью метода setSize() и устанавливается видимость фрейма с помощью метода setVisible(). После выполнения этих действий сообщение "Java Source and Support" будет отображено в центре нового окна.
	*/
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setFont(new Font("Serif", Font.PLAIN, 48));
		paintHorizontallyCenteredText(g2, "Java Source", 200, 75);
		paintHorizontallyCenteredText(g2, "and", 200, 125);
		paintHorizontallyCenteredText(g2, "Support", 200, 175);
	}
	protected void paintHorizontallyCenteredText(
			Graphics2D g2, String s, float centerX, float baselineY) {

		FontRenderContext frc = g2.getFontRenderContext();
		Rectangle2D bounds = g2.getFont().getStringBounds(s, frc);
		float width = (float) bounds.getWidth();
		g2.drawString(s, centerX - width / 2, baselineY);
	}
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().add(new displayMessageInNewFrame());
		f.setSize(450, 350);
		f.setVisible(true);
	}
}
