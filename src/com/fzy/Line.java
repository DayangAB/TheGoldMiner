package com.fzy;

import java.awt.*;

/**
 * @Author Dayang
 * @Date 2021/8/8
 * @Version 1.0
 */
public class Line {
    //起点坐标
    int x=380;
    int y=180;
    //终点坐标
    int endx=500;
    int endy=500;

    void paintSelf(Graphics g){
        g.setColor(Color.red);
        g.drawLine(x,y,endx,endy);
    }
}
