package Java_5_BorderLayout;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    //Layout manager = Defines the natural layout for components within a container

    //3 common managers

    //BorderLayout = A BorderLayout places components in five areas: NORTH , SOUTH , WEST , EAST , CENTER.
    //               All extra space is placed in the center area

    MyFrame(){

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout());
        frame.setLayout(new BorderLayout(10,10));
        frame.setVisible(true);

        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        panel.setBackground(Color.red);
        panel1.setBackground(Color.green);
        panel2.setBackground(Color.yellow);
        panel3.setBackground(Color.magenta);
        panel4.setBackground(Color.blue);

        panel.setPreferredSize(new Dimension(100,100));
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));


        frame.add(panel,BorderLayout.NORTH);
        frame.add(panel1,BorderLayout.WEST);
        frame.add(panel2,BorderLayout.EAST);
        frame.add(panel3,BorderLayout.SOUTH);
        frame.add(panel4,BorderLayout.CENTER);

        //----------------Sub panel---------------------------

        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();

        panel5.setBackground(Color.black);
        panel6.setBackground(Color.darkGray);
        panel7.setBackground(Color.gray);
        panel8.setBackground(Color.lightGray);
        panel9.setBackground(Color.white);

        panel4.setLayout(new BorderLayout());

        panel5.setPreferredSize(new Dimension(50,50));
        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));

        panel4.add(panel5 ,BorderLayout.NORTH);
        panel4.add(panel6 ,BorderLayout.SOUTH);
        panel4.add(panel7 ,BorderLayout.WEST);
        panel4.add(panel8 ,BorderLayout.EAST);
        panel4.add(panel9 ,BorderLayout.CENTER);

    }


}
