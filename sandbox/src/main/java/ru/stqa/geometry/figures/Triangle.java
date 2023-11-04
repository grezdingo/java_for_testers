package ru.stqa.geometry.figures;

public class Triangle {
    public static void printPerimeterAndArea(double sideA, double sideB, double sideC) {
        boolean triangleExists = (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);
        if (triangleExists) {
            String textPerimeter = String.format("The perimeter of the triangle = %f", perimeter(sideA, sideB, sideC));
            String textArea = String.format("The area of the triangle = %f", area(sideA, sideB, sideC));
            System.out.println(textPerimeter);
            System.out.println(textArea);
        }
        else {
            String textNonexistent = String.format("Triangle with sides %f, %f and %f does not exist", sideA, sideB, sideC);
            System.out.println(textNonexistent);
        }
    }

    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double area(double a, double b, double c) {
        double semiPerimeter = perimeter(a, b, c) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
        return Math.round(area * 100.0) / 100.0;
    }
}
