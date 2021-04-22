package Java_4_JButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame(){

        ImageIcon icon = new ImageIcon("Icons/egg-3-icon.png");
        ImageIcon icon2 = new ImageIcon("Icons/boobs.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);



        button = new JButton();
        button.setBounds(110,100,250,100);
        button.addActionListener(this);
        //button.addActionListener(e ->System.out.println("Egg")); // lambda
        button.setText("I'a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic Sans" , Font.PLAIN , 30));
        button.setIconTextGap(-15);
        button.setForeground(new Color(178,19,78));
        button.setBackground(new Color(150,67,52));
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(true);



        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(button);
        this.add(label);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
//            //System.out.println("Poo");
            button.setEnabled(false); //Clickable only once
            label.setVisible(true);
       }
    }
}
