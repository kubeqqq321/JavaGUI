package Java_2_JLabels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyJLabel {
    public static void main(String[] args) {



        //JLabel = a GUI display area for a string to text, or both

        ImageIcon image = new ImageIcon("Icons/keny.png"); //bot.png
        Border border = BorderFactory.createLineBorder(Color.blue,3);

        JLabel label = new JLabel(); //create label
        label.setText("Bro, do you even code?"); //Set text lable
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT CENTER RIGHT if imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP CENTER BOTTOM of iamgeicon
        label.setForeground(new Color(14,167,235)); // set color of te text
        label.setFont(new Font("MV Boli" , Font.PLAIN, 50)); // set font of text
        label.setIconTextGap(-10); //set gap of text to image
        label.setBackground(Color.BLACK); //set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+ text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon + text within label
        //label.setBounds(40,30,400,400); //set x,y position within frame as well as dimensions


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500 ,500);
        // frame.setLayout(null);

        frame.setVisible(true);
        frame.add(label);
        frame.pack();



    }
}
