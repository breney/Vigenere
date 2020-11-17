package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public  class Interface implements ActionListener {

    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JTextArea textArea1 = new JTextArea(3, 10);
    JTextArea textArea2 = new JTextArea(3, 10);

    Interface() {

        //Creating Panel to the game
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(204,204,204));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        //Creating title panel
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);

        textArea1.setFont(new Font("Serif", Font.ITALIC, 16));
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);

        textArea2.setFont(new Font("Serif", Font.ITALIC, 16));
        textArea2.setLineWrap(true);
        textArea2.setWrapStyleWord(true);

        title_panel.add(textArea1, BorderLayout.EAST);
        title_panel.add(textArea2, BorderLayout.WEST);

        frame.add(title_panel, BorderLayout.NORTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
