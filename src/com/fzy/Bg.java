package com.fzy;

import java.awt.*;

public class Bg {
    Image bg = Toolkit.getDefaultToolkit().getImage("imgs/bg.jpg");
    Image bg1 = Toolkit.getDefaultToolkit().getImage("imgs/bg1.jpg");
    Image peo = Toolkit.getDefaultToolkit().getImage("imgs/peo.png");

    void paintSelf(Graphics g){
        g.drawImage(bg1,0,0,null);
        g.drawImage(bg,0,200,null);
        g.drawImage(peo,310,50,null);
    }
}
