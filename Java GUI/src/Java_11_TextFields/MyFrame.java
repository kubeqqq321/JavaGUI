package Java_11_TextFields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.addActionListener(this);
        this.add(button);

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN , 35 ));
        textField.setForeground(new Color(73,63,243));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        //textField.setText("username:");
        //textField.setEnabled(false);
        this.add(textField);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            textField.getText();
            button.setEnabled(false);
            textField.setEditable(false);
        }
    }
}
