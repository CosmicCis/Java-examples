package GUIFlatLaf;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.MemoryImageSource;

public class createTransparentCursor2 {
	/*
	Problem Description
	How to create a transparent cursor?

	Solution
	Following example demonstrates how to create a transparent cursor by using createCustomCursor() method with "invisiblecursor" as an argument.
	*/
	public static void main(String[] argv) throws Exception {
		int[] pixels = new int[16 * 16];
		// устанавливаем альфа-канал для каждого пикселя в 0
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
		BufferedImage image = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
		image.setRGB(0, 0, 16, 16, pixels, 0, 16);
		Cursor transparentCursor = Toolkit.getDefaultToolkit().createCustomCursor(
				image, new Point(0, 0), "invisibleCursor");
		System.out.println("Transparent Cursor created.");
	}
}

