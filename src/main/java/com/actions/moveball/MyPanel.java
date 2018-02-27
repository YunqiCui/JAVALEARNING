package com.actions.moveball;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyPanel extends JPanel implements KeyListener {

    int x=10;
    int y=10;
    public void paint(Graphics g){
        super.paint(g);

        g.fillOval(x,y,30,30);}


    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            System.out.println("Down");
            y+=5;
        }else if(e.getKeyCode()==KeyEvent.VK_UP){
            System.out.println("Up");
            y-=5;
        }else if(e.getKeyCode()==KeyEvent.VK_LEFT){
            System.out.println("Left");
            x-=5;
        }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            System.out.println("Right");
            x+=5;
        }else{
            System.out.println("Not a direction key");
        }
        this.repaint();
    }

    public void keyReleased(KeyEvent e) {



    }
}
