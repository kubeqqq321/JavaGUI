package Java_21_MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;


    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);


        smile = new ImageIcon("Icons/smile.png");
        nervous = new ImageIcon("Icons/nervous.png");
        pain = new ImageIcon("Icons/pain.png");
        dizzy = new ImageIcon("Icons/dizzy.png");

        label = new JLabel();
//        label.setBounds(0,0,100,100);
//        label.setBackground(Color.RED);
//        label.setOpaque(true);
//        label.setVisible(true);
//        label.addMouseListener(this);
//        this.addMouseListener(this);
        label.setIcon(smile);
        label.addMouseListener(this);


        this.add(label);

        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        //Invoked when the mouse button has been clicked (pressed and released) on a component
        //System.out.println("You clicked the mouse");

    }

    @Override
    public void mousePressed(MouseEvent e) {
//        Invoked when a mouse button has been pressed on a component
//        System.out.println("You pressed the mouse");
//        label.setBackground(Color.YELLOW);
        label.setIcon(pain);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        Invoked when a mouse button has released on a component
//        System.out.println("You released the mouse");
//        label.setBackground(Color.GREEN);
        label.setIcon(dizzy);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        Invoked when the mouse enters a component
//        System.out.println("You entered the mouse");
//        label.setBackground(Color.BLUE);
        label.setIcon(nervous);

    }

    @Override
    public void mouseExited(MouseEvent e) {
//        Invoked when the mouse exist a component
//        System.out.println("You exited the mouse");
        label.setIcon(smile);


    }
}
