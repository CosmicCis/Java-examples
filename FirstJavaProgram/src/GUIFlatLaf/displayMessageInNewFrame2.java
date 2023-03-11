package GUIFlatLaf;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;

public class displayMessageInNewFrame2 {
	/*
Problem Description
How to display a message in a new frame?

Solution
Following example demonstrates how to display message in a new frame by creating a frame using JFrame() & using JFrames getContentPanel(), setSize() & setVisible() methods to display this frame.
Данный код создает новое окно, которое содержит компоненты TextArea (многострочный текстовый редактор) и Button (кнопку).
Первоначально создается объект типа Frame с заголовком "GitHub". Затем создаются два компонента: TextArea и Button. Компонент TextArea содержит строку "GitLab".
Для того чтобы расположить эти компоненты в окне, используется объект типа BorderLayout. Компонент TextArea добавляется в область BorderLayout.NORTH, то есть в верхнюю часть окна, а компонент Button - в BorderLayout.SOUTH, то есть в нижнюю часть окна.
Затем устанавливаются размеры окна с помощью метода setSize() и делается окно видимым с помощью метода setVisible().
При запуске программы появится новое окно с заголовком "GitHub", содержащее многострочный текстовый редактор с текстом "GitLab" в верхней части окна и кнопку в нижней части окна.
	*/
	public static void main(String[] args) {
		Frame f = new Frame("GitHub");
		Component text = new TextArea("GitLab");
		Component button = new Button("Button");
		f.add(text, BorderLayout.NORTH);
		f.add(button, BorderLayout.SOUTH);
		int width = 300;
		int height = 300;
		f.setSize(width, height);
		f.setVisible(true);
	}
}
