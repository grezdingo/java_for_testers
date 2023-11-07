package ru.stqa.geometry.figures;

public record Rectangle(double a, double b) {

    public static void printArea(Rectangle rectangle) {
        String text = String.format("The area of the rectangle with sides %f and %f = %f",
                rectangle.a, rectangle.b, rectangle.area());
        System.out.println(text);
    }

    private double area() {
        return this.a * this.b;
    }
}
