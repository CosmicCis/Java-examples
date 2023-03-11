package GUIFlatLaf;

import javax.swing.*;
public class MyWindow1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("My Window");
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Центрирование окна
		frame.setLocationRelativeTo(null);

		frame.setVisible(true);

	}
}
