package Java_9_OpenNewWindow;

import javax.swing.*;
import java.awt.*;

public class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");

    NewWindow(){

        label.setBounds(100,100 , 100,50);
        label.setFont(new Font(null,Font.PLAIN , 25));
        frame.add(label);

        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);





    }

}
