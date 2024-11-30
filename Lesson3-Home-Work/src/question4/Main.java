package question4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "y";

        while (answer.equalsIgnoreCase("y")) {
            getAreas();
            System.out.println("Do you want to continue(y/n): ");
            answer = scanner.nextLine();
        }
        scanner.close();
    }

    public static void getAreas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
            Enter C for Circle\
            
            Enter R for Rectangle \
            
            Enter T for Triangle""");

        String shapeType = scanner.nextLine();

        switch (shapeType) {
            case "C":
                System.out.println("Enter the radius of the circle");
                String radius = scanner.nextLine();
                Circle circle = new Circle(Double.parseDouble(radius));
                System.out.println("The area of the circle is: " + circle.computeArea());
                break;
            case "R":
                System.out.println("Enter the width of the rectangle");
                String width = scanner.nextLine();
                System.out.println("Enter the height of the rectangle");
                String rectangleHeight = scanner.nextLine();
                Rectangle rectangle = new Rectangle(Double.parseDouble(width), Double.parseDouble(rectangleHeight));
                System.out.println("The area of the rectangle is: " + rectangle.computeArea());
                break;
            case "T":
                System.out.println("Enter the base of the triangle");
                String base = scanner.nextLine();
                System.out.println("Enter the height of the triangle");
                String triangleHeight = scanner.nextLine();
                Triangle triangle = new Triangle(Double.parseDouble(base), Double.parseDouble(triangleHeight));
                System.out.println("The area of the triangle is: " + triangle.computeArea());
                break;
            default:
                System.out.println("Invalid shape given");
                break;
        }

    }
}
