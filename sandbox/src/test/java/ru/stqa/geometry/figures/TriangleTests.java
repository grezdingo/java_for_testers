package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculatePerimeter() {
        double result = Triangle.perimeter(2.0, 3.0, 3.0);
        Assertions.assertEquals(8.0, result);
    }

    @Test
    void canCalculateArea() {
        double result = Triangle.area(2.0, 3.0, 3.0);
        Assertions.assertEquals(2.83, result);
    }
}
