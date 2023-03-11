package GUIFlatLaf;

//import com.formdev.flatlaf.FlatLightLaf;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class displayTextDifferentFonts extends JPanel {
    //UIManager.LookAndFeelInfo..setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());

    //FlatLaf.DisabledIconProvider.setup();

    // create UI here...
    String[] type = { "Serif","SansSerif"};
    int[] styles = { Font.PLAIN, Font.ITALIC, Font.BOLD, Font.ITALIC + Font.BOLD };
    String[] stylenames = { "Plain", "Italic", "Bold", "Bold & Italic" };

    public void paint(Graphics g) {
        for (int f = 0; f < type.length; f++) {
            for (int s = 0; s < styles.length; s++) {
                Font font = new Font(type[f], styles[s], 18);
                g.setFont(font);
                String name = type[f] + " " + stylenames[s];
                g.drawString(name, 20, (f * 4 + s + 1) * 20);
            }
        }
    }
    public static void main(String[] a) {
        FlatLightLaf.setup();

// create UI here...
        JFrame f = new JFrame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setContentPane(new displayTextDifferentFonts());
        f.setLocationRelativeTo(null); // centers the frame on the screen

        f.setSize(400,400);
        f.setVisible(true);

    }
}