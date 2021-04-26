package Java_22_DragAndDrop;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    DragPanel dragPanel = new DragPanel();

    MyFrame(){


        this.setTitle("Drag & Drop DEMO");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Kenny Mouse");
        this.setVisible(true);
        this.add(dragPanel);
    }

}
