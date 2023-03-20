package org.example;

public class Circle {
    private int radius;
    private String color;

    public double area() {
        double S = this.radius * this.radius * Math.PI;
        return S;
    }
    public double perimeter(){
        double P = 2* Math.PI* this.radius;
        return P;
    }
    public Circle(int radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public String toString(){
        double s = area();
        double p = perimeter();
        String S = this.radius+ " " + " " + this.color + " " + s + " " + p;
        return S;
    }


}
