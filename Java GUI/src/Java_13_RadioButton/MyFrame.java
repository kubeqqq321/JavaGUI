package Java_13_RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton burgerButton;
    JRadioButton hotdogButton;
    ImageIcon pizzaIcon;
    ImageIcon burgerIcon;
    ImageIcon hotdogIcon;


    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());




        pizzaIcon = new ImageIcon("Icons/pizza.png");
        pizzaButton = new JRadioButton("pizza");
        pizzaButton.addActionListener(this);
        pizzaButton.setIcon(pizzaIcon);
        pizzaButton.setFocusable(false);


        burgerIcon = new ImageIcon("Icons/hamburger.png");
        burgerButton = new JRadioButton("hamburger");
        burgerButton.addActionListener(this);
        burgerButton.setIcon(burgerIcon);
        burgerButton.setFocusable(false);


        hotdogIcon = new ImageIcon("Icons/hotdog.png");
        hotdogButton = new JRadioButton("hot-dog");
        hotdogButton.addActionListener(this);
        hotdogButton.setIcon(hotdogIcon);
        hotdogButton.setFocusable(false);


        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(pizzaButton);
        buttonGroup.add(burgerButton);
        buttonGroup.add(hotdogButton);


        this.add(pizzaButton);
        this.add(burgerButton);
        this.add(hotdogButton);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == pizzaButton){
            System.out.println("You ordered pizza");
        }else if(e.getSource() == burgerButton){
            System.out.println("You ordered Hamburger");
        }else if(e.getSource() == hotdogButton){
            System.out.println("You ordered Hot Dog");
        }

    }
}
