package A3; 
import java.util.Scanner;

class Circle {

    double radius;
    String colour;

    // Method to get input
    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius:");
        radius = sc.nextDouble();

        System.out.println("Enter Colour:");
        colour = sc.next();
    }

    // Method to calculate area
    void calcArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of the Circle: " + area);
        System.out.println("color of the Circle: " + colour);
        
    }
}

public class CircleMain {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.getInput();
        c.calcArea();
    }
}
