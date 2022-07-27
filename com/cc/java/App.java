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
        output("Differenz r-t: " + areaDiff(rectangle, triangle));
        output("Differenz c-t: " + areaDiff(circle, triangle));
        output("Differenz r-c: " + areaDiff(rectangle, circle));


}

    /* Besser mit Polymorphie! */
    
    private static double areaDiff(Shape S1, Shape S2){
        return S1.area() - S2.area();   
        }

    // private static double areaDiff(Rectangle r, Circle t){
    //     return r.area() - t.area();   
    //     }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}

