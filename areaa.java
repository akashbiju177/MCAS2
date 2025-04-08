import java.util.Scanner;

// Interface with prototypes of area() and perimeter() methods
interface Shape {
    double area();
    double perimeter();
}

// Circle class implementing the Shape interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class implementing the Shape interface
class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

// Main class with menu-driven program
public class areaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = sc.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Area of Circle: " + circle.area());
                    System.out.println("Perimeter of Circle: " + circle.perimeter());
                    break;

                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = sc.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println("Area of Rectangle: " + rectangle.area());
                    System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}

