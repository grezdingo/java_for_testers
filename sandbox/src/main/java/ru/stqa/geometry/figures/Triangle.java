package ru.stqa.geometry.figures;

public record Triangle(double sideA, double sideB, double sideC) {

    public Triangle {
        boolean triangleExists = sideA > 0 && sideB > 0 && sideC > 0 &&
                (sideA + sideB > sideC) &&
                (sideA + sideC > sideB) &&
                (sideB + sideC > sideA);
        if (!triangleExists) {
            throw new IllegalArgumentException(String.format("Triangle with sides %f, %f and %f does not exist",
                    sideA, sideB, sideC));
        }
    }

    public static void printPerimeterAndArea(Triangle triangle) {
        String textPerimeter = String.format("The perimeter of the triangle = %f", triangle.perimeter());
        String textArea = String.format("The area of the triangle = %f", triangle.area());
        System.out.println(textPerimeter);
        System.out.println(textArea);
    }

    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    public double area() {
        double semiPerimeter = perimeter() / 2;
        double area = Math.sqrt(semiPerimeter *
                (semiPerimeter - this.sideA) *
                (semiPerimeter - this.sideB) *
                (semiPerimeter - this.sideC));
        return Math.round(area * 100.0) / 100.0;
    }
}
