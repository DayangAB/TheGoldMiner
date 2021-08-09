package com.fzy;

import java.awt.*;

public class Line {
    //起点坐标
    int x=380;
    int y=180;
    //终点坐标
    int endx=500;
    int endy=500;
    //线长
    double length = 100;
    double n = 0;
    //方向
    int dir = 1;
    //状态 0 摇摆 1 抓取 2 收回 3 抓取返回
    int state;

    GameWin frame;

    Line(GameWin frame){this.frame=frame;}

    void logic(){
        for(Object obj:this.frame.objectList){
            if(endx>obj.x && endx<obj.x+obj.width
                    && endy>obj.y && endy< obj.y+obj.height){
                state=3;
                obj.flag=true;
            }
        }

    }

    void lines(Graphics g){
        endx = (int) (x +length*Math.cos(n* Math.PI));
        endy = (int) (y +length*Math.sin(n*Math.PI));
        g.setColor(Color.red);
        g.drawLine(x,y,endx,endy);
    }


    void paintSelf(Graphics g){
        logic();
        switch (state){
            case 0:
                if(n<0.1){ dir = 1;}
                else if (n>0.9){dir = -1;}
                n=n+0.005*dir;
                lines(g);
                break;
            case 1:
                if(length<500){
                    length=length+10;
                    lines(g);
                }else {state=2;}
                break;
            case 2:
                if(length>100){
                    length=length-10;
                    lines(g);
                }else {
                    state=0;
                }
                break;
            case 3:
                if(length>100){
                    length=length-10;
                    lines(g);
                    for(Object obj:this.frame.objectList){
                        if(obj.flag){
                            obj.x=endx-obj.getWidth()/2;
                            obj.y=endy;
                            if(length<=100){
                                obj.x=-150;
                                obj.y=-150;
                                obj.flag=false;
                                state=0;
                            }
                        }

                    }
                }
                break;



                default:
        }



    }
}
