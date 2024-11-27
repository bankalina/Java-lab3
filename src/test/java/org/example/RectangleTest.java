package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testGetArea() {
        Rectangle rectangle = new Rectangle(5, 10, new Color(255, 0, 0));
        assertEquals(50, rectangle.getArea());
    }

    @Test
    void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(5, 10, new Color(0, 255, 0));
        assertEquals(30, rectangle.getPerimeter());
    }

    @Test
    void testColorAssignment() {
        Color color = new Color(0, 0, 255);
        Rectangle rectangle = new Rectangle(5, 5, color);
        assertEquals(color, rectangle.getColor());
    }

    @Test
    void testGetColorDescription() {
        Rectangle rectangle = new Rectangle(5, 10, new Color(255, 255, 255, 1.0));
        assertEquals("RGBA: (255, 255, 255, 1.0)", rectangle.getColorDescription());
    }
}
