import java.util.Scanner;

public class Calnum {
    public static void main(String[] args) {
        int x, y;

        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Input Number 1 : ");
            x = keyboard.nextInt();

            System.out.print("Input Number 2 : ");
            y = keyboard.nextInt();
        }

        System.out.println(x + " + " + y + " = " + ( x + y));
    }
}
