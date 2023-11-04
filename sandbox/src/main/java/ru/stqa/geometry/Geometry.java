package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {
        Square.printArea(7.0);
        Square.printArea(5.0);
        Square.printArea(3.0);

        Rectangle.printArea(3.0, 5.0);
        Rectangle.printArea(7.0, 9.0);
    }
}
