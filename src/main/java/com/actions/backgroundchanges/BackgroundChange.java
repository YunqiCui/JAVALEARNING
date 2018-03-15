/*
 * Learning ActionListeners
 */
package com.actions.backgroundchanges;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackgroundChange extends JFrame implements ActionListener{

    JPanel jp = new JPanel();
    JButton jb1,jb2;

    public static void main(String[] args) {
        BackgroundChange al = new BackgroundChange();
    }

    public BackgroundChange(){
        jp = new JPanel();
        jb1 = new JButton("Black");
        jb2 = new JButton("Red");

        jp.add(jb1,BorderLayout.NORTH);
        jp.add(jb2,BorderLayout.SOUTH);
        jb1.addActionListener(this);
        jb1.setActionCommand("Black");
        jb2.addActionListener(this);
        jb2.setActionCommand("Red");

        this.add(jp);
        jp.setBackground(Color.RED);
        this.setTitle("Test");
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLocation(200,200);

    }

    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Black")){
            jp.setBackground(Color.black);
        }else if(e.getActionCommand().equals("Red")){
            jp.setBackground(Color.red);
            }

    }
}
