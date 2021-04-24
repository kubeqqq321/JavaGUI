package Java_10_JOptionPane;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        //JOptionPane = pop up a standard dialog box that prompts users for a value
        //              or informs them of something


       JOptionPane.showMessageDialog(null,"This is PLAIN_MESSAGE" , "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"This is INFORMATION_MESSAGE" , "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"This is QUESTION_MESSAGE" , "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"This is WARNING_MESSAGE" , "title", JOptionPane.WARNING_MESSAGE);
       JOptionPane.showMessageDialog(null,"This is ERROR_MESSAGE" , "title", JOptionPane.ERROR_MESSAGE);


       JOptionPane.showConfirmDialog(null,"bro, do you even code? " , "title", JOptionPane.YES_NO_CANCEL_OPTION);

       //int answers = JOptionPane.showConfirmDialog(null,"bro, do you even code? " , "title", JOptionPane.YES_NO_CANCEL_OPTION);

       String name = JOptionPane.showInputDialog("What is your name?:");
        System.out.println(name);


        String[] responses = {"No, you are awesome!" , "thank you" , "*blush*"};
        ImageIcon image = new ImageIcon("Icons/egg-3-icon.png");
        JOptionPane.showOptionDialog(null
                                    ,"You are awesome"
                                    , "secret message"
                                    , JOptionPane.YES_NO_CANCEL_OPTION
                                    , JOptionPane.INFORMATION_MESSAGE
                                    , image ,responses,0);

    }

}
