package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Color color1 = new Color(43, 13, 133, 0.5);
        Color color2 = new Color(255, 255, 255);
        Color color3 = new Color(0, 0, 0, 1.0);
        Color color4 = new Color(113, 109, 230, 0.6);

        Logger customLogger = LoggerFactory.getLogger(Main.class);
        ShapeDescriber describer = new ShapeDescriber(customLogger);

        Rectangle rectangle = new Rectangle(5, 10, color1);
        Rectangle rectangle2 = new Rectangle(15, 10, color2);
        Triangle triangle = new Triangle(8, 8, 8, color3);
        Triangle triangle2 = new Triangle(4, 5, 6, color4);

        describer.describe(rectangle);
        describer.describe(rectangle2);
        describer.describe(triangle);
        describer.describe(triangle2);
    }
}
