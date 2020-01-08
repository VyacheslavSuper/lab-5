package com.company;

public class Rectangle extends Shape {
    public Rectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    public int getS(){
        return getWidth() * getHeight();
    }

}
