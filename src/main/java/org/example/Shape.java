package org.example;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getColorDescription() {
        return "RGBA: (" + color.R() + ", " + color.G() + ", " + color.B() + ", " + color.A() + ")";
    }

    public void print() {
        System.out.println("Shape");
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

