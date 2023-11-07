package ru.stqa.geometry.figures;

public record Square(double side) {

    public static void printArea(Square square) {
        String text = String.format("The area of the square with side %f = %f",
                square.side, square.area());
        System.out.println(text);
    }

    public double area() {
        return this.side * this.side;
    }

    public double perimeter() {
        return 4 * this.side;
    }
}
