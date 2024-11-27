package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShapeDescriber {
    private final Logger logger;

    public ShapeDescriber(Logger logger) {
        this.logger = logger;
    }

    public void describe(Shape shape) {
        logger.info("Describing shape: {}", shape.getClass().getSimpleName());
        logger.info("Color: {}", shape.getColorDescription());
        logger.info("Area: {}", shape.getArea());
        logger.info("Perimeter: {}", shape.getPerimeter());
    }
}
