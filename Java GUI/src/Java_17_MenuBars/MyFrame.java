package Java_17_MenuBars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;


    MyFrame(){

        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("edit");
        helpMenu = new JMenu("help");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);



        loadIcon = new ImageIcon("png/Load.png");
        loadItem = new JMenuItem("Load");
        loadItem.setIcon(loadIcon);
        loadItem.addActionListener(this);



        saveIcon = new ImageIcon("png/save.png");
        saveItem = new JMenuItem("Save");
        saveItem.setIcon(saveIcon);
        saveItem.addActionListener(this);



        exitIcon = new ImageIcon("png/Turn off.png");
        exitItem = new JMenuItem("Exit");
        exitItem.setIcon(exitIcon);
        exitItem.addActionListener(this);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for file
        fileMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for edit
        fileMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for help
        loadItem.setMnemonic(KeyEvent.VK_L); // L for loaded
        saveItem.setMnemonic(KeyEvent.VK_S); // S for save
        exitItem.setMnemonic(KeyEvent.VK_E); // E for exit



        this.setJMenuBar(menuBar);

        this.setLayout(new FlowLayout());
        this.setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loadItem){
            System.out.println("*beep boop* You loaded file");
        }else if(e.getSource() == saveItem){
            System.out.println("*beep boop* You saved file");
        }else if(e.getSource() == exitItem){
            System.exit(0);

        }

    }
}
