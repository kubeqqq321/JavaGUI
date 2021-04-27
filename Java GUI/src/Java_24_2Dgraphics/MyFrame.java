package Java_24_2Dgraphics;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyPanel panel;

    MyFrame() {

        panel = new MyPanel();
        this.add(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.pack();

        this.setVisible(true);


    }




}
