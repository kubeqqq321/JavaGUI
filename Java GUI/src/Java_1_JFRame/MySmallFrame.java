package Java_1_JFRame;

import javax.swing.*;
import java.awt.*;

public class MySmallFrame extends JFrame {

    MySmallFrame(){
        this.setVisible(true);//make this visible
        this.setSize(420, 420);//sets the x-Dimension,and y-Dimension of this
        this.setTitle("JFrame title is here");//sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
        this.setResizable(false);//prevent this from being resized

        ImageIcon image = new ImageIcon("logo.png");//create an ImageIcon
        this.setIconImage(image.getImage());//change icon of this
        this.getContentPane().setBackground(new Color(200, 89, 89));//change color of background rgb
        //this.getContentPane().setBackground(new Color(0xF681A9));//change color of background hex


    }


}
