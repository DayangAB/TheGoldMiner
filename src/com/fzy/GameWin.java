package com.fzy;

import javax.swing.*;

/**
 * @Author Dayang
 * @Date 2021/8/8
 * @Version 1.0
 * 1 窗口绘制
 */
public class GameWin extends JFrame {
    void launch(){
        this.setTitle("尚学堂黄金矿工");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        GameWin gameWin=new GameWin();
        gameWin.launch();
    }
}
