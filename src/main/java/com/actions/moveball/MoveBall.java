package com.actions.moveball;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MoveBall extends JFrame implements ActionListener{

    MyPanel mp;

    public static void main(String[] args) {
        MoveBall mb = new MoveBall();
    }

    public MoveBall(){

        mp = new MyPanel();
        this.add(mp);
        this.addKeyListener(mp);
        this.setTitle("Move Ball");
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(200,200);
        this.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {

    }
}
