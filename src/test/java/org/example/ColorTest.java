package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColorTest {
    @Test
    void testDefaultAlpha() {
        Color color = new Color(255, 0, 0);
        assertEquals(0.0, color.A());
    }

    @Test
    void testColorValues() {
        Color color = new Color(100, 150, 200, 0.5);
        assertEquals(100, color.R());
        assertEquals(150, color.G());
        assertEquals(200, color.B());
        assertEquals(0.5, color.A());
    }
}
