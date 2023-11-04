package ru.stqa.geometry.figures;

public class Square {
    public static void printArea(double side) {
        String text = String.format("The area of the square with side %f = %f", side, area(side));
        System.out.println(text);
    }

    public static double area(double a) {
        return a * a;
    }

    public static double perimeter(double a) {
        return 4 * a;
    }
}
