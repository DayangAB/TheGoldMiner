package com.fzy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameWin extends JFrame {

    Bg bg = new Bg();
    Line line = new Line();
    Gold gold = new Gold();
    void launch(){
        this.setVisible(true);
        this.setSize(768,1000);
        this.setLocationRelativeTo(null);
        this.setTitle("尚学堂黄金矿工");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(e.getButton()==1)
                {line.state=1;}
            }
        });

        while (true){
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        bg.paintSelf(g);
        line.paintSelf(g);
        gold.paintSelf(g);
    }

    public static void main(String[] args) {
        GameWin gameWin=new GameWin();
        gameWin.launch();
    }
}
