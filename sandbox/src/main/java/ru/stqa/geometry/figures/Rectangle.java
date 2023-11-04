package ru.stqa.geometry.figures;

public class Rectangle {
    public static void printArea(double a, double b) {
        String text = String.format("The area of the rectangle with sides %f and %f = %f", a, b, area(a, b));
        System.out.println(text);
    }

    private static double area(double a, double b) {
        return a * b;
    }
}
