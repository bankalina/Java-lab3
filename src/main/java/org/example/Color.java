package org.example;

public record Color(int R, int G, int B, double A) {
    public Color(int R, int G, int B) {
        this(R, G, B, 0.0);
    }

    public void print() {
        System.out.println("RGBA:(" + R + "," + G + "," + B + "," + A + ")");
    }
}
