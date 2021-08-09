package com.fzy;

import java.awt.*;

/**
 * @Author Dayang
 * @Date 2021/8/9
 * @Version 1.0
 */
public class Rock extends Object{
    Rock(){
        this.x=(int)(Math.random()*700);
        this.y=(int)(Math.random()*550+300);
        this.width=71;
        this.height=71;
        this.flag=false;
        this.img = Toolkit.getDefaultToolkit().getImage("imgs/rock1.png");
    }
}
