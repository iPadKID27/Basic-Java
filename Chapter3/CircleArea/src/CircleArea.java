import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the radius: ");
            double radius = input.nextDouble();

            if (radius < 0) {
                System.out.println("Error: Radius must be >= 0");
            } else {
                double area = 3.14 * radius * radius;
                System.out.println("The area is " + area);
            }
        }
    }
}
