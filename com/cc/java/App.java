package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
// Objekte der angelegten klassen bilden

        Rectangle rectangle = new Rectangle(10.0, 10.0);

        Triangle triangle = new Triangle(10.0, 10.0);

        Circle circle = new Circle(5.0);

        output("---------- Fläche ----------");
        output("Fläche Rechteck: " + rectangle.area());
        output("Fläche Dreieck: " + triangle.area());
        output("Fläche Kreis: " + circle.area());

    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

