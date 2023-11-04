package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printArea(7.0);
        Square.printArea(5.0);
        Square.printArea(3.0);

        Rectangle.printArea(3.0, 5.0);
        Rectangle.printArea(7.0, 9.0);

        Triangle.printPerimeterAndArea(5.605, 3.0, 3.0);
    }
}
