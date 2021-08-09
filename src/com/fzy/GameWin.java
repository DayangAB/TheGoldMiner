package com.fzy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class GameWin extends JFrame {

    //存储金块,石块
    List<Object> objectList = new ArrayList<>();
    Bg bg = new Bg();
    Line line = new Line(this);


    {
        for (int i = 0; i < 11; i++) {
            double random =Math.random();
            if(random <0.3){objectList.add(new GoldMini());}
            else if(random <0.7){objectList.add(new Gold());}
            else {objectList.add(new GoldPlus());}
        }
        for (int i = 0; i < 3; i++) {
            objectList.add(new Rock());
        }
    }

    Image offScreenImage;

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
        offScreenImage = this.createImage(768,1000);
        Graphics gImage = offScreenImage.getGraphics();

        bg.paintSelf(gImage);
        line.paintSelf(gImage);

        for(Object obj:objectList)
        {
            obj.paintSelf(gImage);
        }

        g.drawImage(offScreenImage,0,0,null);
    }

    public static void main(String[] args) {
        GameWin gameWin=new GameWin();
        gameWin.launch();
    }
}
