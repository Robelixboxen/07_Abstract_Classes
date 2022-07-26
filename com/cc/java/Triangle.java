package com.cc.java;

public class Triangle extends Shape{

    private double height, width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return width * height / 2;
    }
}
