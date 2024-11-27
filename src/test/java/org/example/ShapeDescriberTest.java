package org.example;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import static org.mockito.Mockito.*;

class ShapeDescriberTest {
    @Test
    void testDescribeRectangle() {
        // Tworzymy mock loggera
        Logger mockLogger = mock(Logger.class);
        // Tworzymy ShapeDescriber z zamockowanym loggerem
        ShapeDescriber describer = new ShapeDescriber(mockLogger);

        Rectangle rectangle = new Rectangle(5, 10, new Color(255, 0, 0));
        describer.describe(rectangle);

        verify(mockLogger).info("Describing shape: {}", "Rectangle");
        verify(mockLogger).info("Color: {}", "Red: 255, Green: 0, Blue: 0, Alpha: 0.0");
        verify(mockLogger).info("Area: {}", 50.0);
        verify(mockLogger).info("Perimeter: {}", 30.0);
    }

    @Test
    void testDescribeTriangle() {
        Logger mockLogger = mock(Logger.class);
        ShapeDescriber describer = new ShapeDescriber(mockLogger);

        Triangle triangle = new Triangle(3, 4, 5, new Color(0, 255, 0));
        describer.describe(triangle);

        verify(mockLogger).info("Describing shape: {}", "Triangle");
        verify(mockLogger).info("Color: {}", "Red: 0, Green: 255, Blue: 0, Alpha: 0.0");
        verify(mockLogger).info("Area: {}", 6.0);
        verify(mockLogger).info("Perimeter: {}", 12.0);
    }
}
