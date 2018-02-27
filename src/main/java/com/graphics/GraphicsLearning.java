/*
 * 1.椭圆边框 drawOval(x,y,w,h)
 * 2.直线 drawLine(int x1, int y1, int x2, int y2)
 * 3.矩形边框 drawRect(x,y,w,h)
 * 4.填充矩形 fillRect(x,y,w,h)
 * 5.填充椭圆 fillOval(x,y,w,h)
 * 6.图片 drawImage(Imgae im, int x, int y)
 * 7.字符串 drawString(String str, int x, int y)
 * 8.设置画笔字体 setFont(Font f)
 * 9.设置画笔颜色 setColor(Color c)
 *
 *
 */

package com.graphics;


import javax.swing.*;

public class GraphicsLearning extends JFrame {

    private MyGraph mg;

    public static void main(String[] args) {
        GraphicsLearning gl = new GraphicsLearning();

    }

    public GraphicsLearning(){
        mg = new MyGraph();
        this.add(mg);
        this.setSize(600,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
