package Java_9_OpenNewWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button =new JButton("Open New Window");

    LaunchPage(){

        button.setBounds(100,160,200,40);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        frame.add(button);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == button){
           frame.dispose();
          NewWindow newWindow= new NewWindow();
       }


    }
}
