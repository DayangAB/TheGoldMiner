package com.fzy;

import java.awt.*;

public class Gold extends Object {

    Gold(){
        this.x=(int)(Math.random()*700);
        this.y=(int)(Math.random()*550+300);
        this.width=52;
        this.height=52;
        this.flag=false;
        this.img = Toolkit.getDefaultToolkit().getImage("imgs/gold1.gif");
    }
}
