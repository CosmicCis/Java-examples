package GUIFlatLaf;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class displayColoursInFrame extends JComponent {
	/*
Problem Description
How to display colours in a frame?

Solution
Following example displays how to a display all the colors in a frame using setRGB method of image class.
Данный код демонстрирует, как отобразить все цвета в окне, используя метод setRGB класса Image. При запуске приложения создается окно с заголовком "Display Colours", которое содержит экземпляр класса displayColoursInFrame. Этот класс расширяет JComponent и переопределяет метод paint, который отображает изображение, созданное методом initialize.

В методе initialize создается изображение с помощью класса BufferedImage, которое содержит массив пикселей, каждый из которых определяет цвет. В данном случае цвета отображаются в виде градиента, который состоит из красной, зеленой и синей компонент. Количество цветов в градиенте зависит от размеров окна, в котором они будут отображены.

В методе paint вызывается метод initialize, если изображение еще не было создано, а затем отображает изображение с помощью метода drawImage.

Кроме того, в методе main создается экземпляр класса JFrame, устанавливается его размер и местоположение на экране. Затем созданный экземпляр displayColoursInFrame добавляется в содержимое окна, окно делается видимым и добавляется обработчик события, который завершает приложение при закрытии окна.
	*/
	BufferedImage image;
	public void initialize() {
		int width = getSize().width;
		int height = getSize().height;
		int[] data = new int[width * height];
		int index = 0;

		for (int i = 0; i < height; i++) {
			int red = (i * 255) / (height - 1);
			for (int j = 0; j < width; j++) {
				int green = (j * 255) / (width - 1);
				int blue = 128;
				data[index++] = (red<<16) | (green<<8) | blue;
			}
		}
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		image.setRGB(0, 0, width, height, data, 0, width);
	}
	public void paint(Graphics g) {
		if (image == null)
			initialize();
		g.drawImage(image, 0, 0, this);
	}
	public static void main(String[] args) {
		JFrame f = new JFrame("Display Colours");
		f.getContentPane().add(new displayColoursInFrame());
		f.setSize(300, 300);
		f.setLocation(100, 100);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// Центрирование окна
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
