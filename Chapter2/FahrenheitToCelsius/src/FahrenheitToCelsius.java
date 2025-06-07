import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a degree in Fahrenheit: ");
            double Fahrenheit = input.nextDouble();
            double Celsius = (5.0/9) * (Fahrenheit - 32);
            System.out.println("Fahremheit " + Fahrenheit + " is " + Celsius + " in Celsius");
        }
    }
}
