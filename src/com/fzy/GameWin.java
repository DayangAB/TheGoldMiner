package com.fzy;

import javax.swing.*;
import java.awt.*;

/**
 * @Author Dayang
 * @Date 2021/8/8
 * @Version 1.0
 */
public class GameWin extends JFrame {
    Bg bg = new Bg();
    void launch(){
        this.setVisible(true);
        this.setSize(768,1000);
        this.setLocationRelativeTo(null);
        this.setTitle("尚学堂黄金矿工");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        bg.paintSelf(g);
    }

    public static void main(String[] args) {
        GameWin gameWin=new GameWin();
        gameWin.launch();
    }
}
