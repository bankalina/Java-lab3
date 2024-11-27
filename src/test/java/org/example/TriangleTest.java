package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void testGetArea() {
        Triangle triangle = new Triangle(3, 4, 5, new Color(255, 255, 0));
        assertEquals(6, triangle.getArea());
    }

    @Test
    void testGetPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5, new Color(255, 0, 255));
        assertEquals(12, triangle.getPerimeter());
    }

    @Test
    void testColorAssignment() {
        Color color = new Color(0, 255, 0);
        Triangle triangle = new Triangle(3, 4, 5, color);
        assertEquals(color, triangle.getColor());
    }

    @Test
    void testInvalidTriangle() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Triangle(1, 2, 10, new Color(0, 0, 0));
        });
        assertEquals("Z boków o takich długościach nie może powstac trójkąt.", exception.getMessage());
    }
}
