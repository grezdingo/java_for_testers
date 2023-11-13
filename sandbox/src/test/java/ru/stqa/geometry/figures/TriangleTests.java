package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(9.0, new Triangle(3.0, 3.0, 3.0).perimeter());
    }

    @Test
    void canCalculateArea() {
        Assertions.assertEquals(3.9, new Triangle(3.0, 3.0, 3.0).area());
    }

    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(-1.0, 3.0, 2.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            // OK
        }
    }

    @Test
    void cannotCreateTriangleWithSides() {
        try {
            new Triangle(8.0, 3.0, 3.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            // OK
        }
    }
}
