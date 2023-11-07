package ru.stqa.geometry.figures;

public record Triangle(double sideA, double sideB, double sideC) {

    public static void printPerimeterAndArea(Triangle triangle) {
        boolean triangleExists = triangle.sideA > 0 && triangle.sideB > 0 && triangle.sideC > 0 &&
                (triangle.sideA + triangle.sideB > triangle.sideC) &&
                (triangle.sideA + triangle.sideC > triangle.sideB) &&
                (triangle.sideB + triangle.sideC > triangle.sideA);
        if (triangleExists) {
            String textPerimeter = String.format("The perimeter of the triangle = %f", triangle.perimeter());
            String textArea = String.format("The area of the triangle = %f", triangle.area());
            System.out.println(textPerimeter);
            System.out.println(textArea);
        }
        else {
            String textNonexistent = String.format("Triangle with sides %f, %f and %f does not exist",
                    triangle.sideA, triangle.sideB, triangle.sideC);
            System.out.println(textNonexistent);
        }
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
