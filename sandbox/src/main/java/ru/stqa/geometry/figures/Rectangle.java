package ru.stqa.geometry.figures;

import java.util.Objects;

public record Rectangle(double a, double b) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return (Double.compare(this.a, rectangle.a) == 0 && Double.compare(this.b, rectangle.b) == 0)
                || (Double.compare(this.a, rectangle.b) == 0 && Double.compare(this.b, rectangle.a) == 0);
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public Rectangle {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Rectangle side should be non-negative");
        }
    }

    public static void printArea(Rectangle rectangle) {
        String text = String.format("The area of the rectangle with sides %f and %f = %f",
                rectangle.a, rectangle.b, rectangle.area());
        System.out.println(text);
    }

    private double area() {
        return this.a * this.b;
    }
}
