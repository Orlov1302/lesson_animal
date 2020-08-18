package com.company;

public class Coordinates {
    private long x, y; // координаты в плоскости
    private long height; // высота
    public void setXY(long x, long y){
        this.x = x;
        this.y = y;
    }
    public void setHeight(long h){
        this.height = h;
    }
    public long getX(){
        return x;
    }
    public long getY(){
        return y;
    }
    public long getHeight(){
        return height;
    }
}
