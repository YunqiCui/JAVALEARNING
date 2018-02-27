/*
 * 在以下情况 paint()方法将被调用。
 * 1.窗口最小化，再最大化
 * 2.窗口大小发生变化
 * 3.repaint()函数被调用
 */


package com.graphics;

import javax.swing.*;
import java.awt.*;

//顶一个 我自己的面板
public class MyGraph extends JPanel {

    //覆盖JPanel paint 方法
    //Graphics 是绘图的重要类  可以理解为一个画笔
    public void paint(Graphics g){

        super.paint(g);
        System.out.println("Method paint() invoked!");
        g.drawOval(20,10,40,30);
        g.drawLine(20,60,40,80);
        g.drawRect(40,80,40,40);
        g.setColor(Color.cyan);
        g.fillRect(100,100,50,50);

        Image im = Toolkit.getDefaultToolkit().getImage("/Users/cuiyunqi/Desktop/HSP/Graphics/src/main/resources/new.png");
        g.drawImage(im,90,90,this);

        g.setColor(Color.cyan);
        g.setFont(new Font("Cyrillic",Font.BOLD,50));
        g.drawString("Hello World!",100,100);

    }

}
