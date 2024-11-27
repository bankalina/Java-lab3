package org.example;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;


    // Konstruktor z walidacją
    public Triangle(double sideA, double sideB, double sideC, Color color) {
        super(color);
        if (!isValidTriangle(sideA, sideB, sideC)) {
            throw new IllegalArgumentException("Z boków o takich długościach nie może powstac trójkąt.");
        }
        this.a = sideA;
        this.b = sideB;
        this.c = sideC;
    }

    // Metoda sprawdzająca, czy z podanych boków może powstać trójkąt
    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
