package com.fzy;

import javax.swing.*;
import java.awt.*;

public class GameWin extends JFrame {

    Bg bg = new Bg();
    Line line = new Line();
    void launch(){
        this.setVisible(true);
        this.setSize(768,1000);
        this.setLocationRelativeTo(null);
        this.setTitle("尚学堂黄金矿工");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

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
    }

    public static void main(String[] args) {
        GameWin gameWin=new GameWin();
        gameWin.launch();
    }
}
