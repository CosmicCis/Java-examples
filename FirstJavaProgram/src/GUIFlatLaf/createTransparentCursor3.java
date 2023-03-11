package GUIFlatLaf;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

public class createTransparentCursor3 {
	/*
	Problem Description
	How to create a transparent cursor?

	Solution
	Following example demonstrates how to create a transparent cursor by using createCustomCursor() method with "invisiblecursor" as an argument.
Данный код создает прозрачный курсор для окна приложения.
Сначала создается экземпляр класса JFrame. Затем с помощью метода createCustomCursor объекта Toolkit устанавливается прозрачный курсор для фрейма. В этом методе создается экземпляр класса BufferedImage с параметрами 3, 3, BufferedImage.TYPE_INT_ARGB. Этот объект используется в качестве изображения для курсора. Также указываются координаты точки (0, 0), в которую должен указывать курсор, и название курсора "null".
После этого курсор становится прозрачным и устанавливается для фрейма. Как результат, курсор при перемещении по окну приложения будет иметь форму невидимой области и будет выглядеть как прозрачный.
	*/
	public static void main(String[] argv) throws Exception {
		JFrame frame = new JFrame();
		frame.setCursor(frame.getToolkit().createCustomCursor(
				new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0),"null"));
	}
}

