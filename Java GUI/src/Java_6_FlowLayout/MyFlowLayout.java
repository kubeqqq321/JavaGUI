package Java_6_FlowLayout;

import javax.swing.*;
import java.awt.*;

public class MyFlowLayout extends JFrame {

    MyFlowLayout() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        this.setLayout(new FlowLayout(FlowLayout.CENTER , 10 , 10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());


        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        this.add(panel);
        this.setVisible(true);
    }


}
