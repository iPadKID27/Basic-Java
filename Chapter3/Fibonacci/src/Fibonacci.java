import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int x0, x1, x2;
            x0 = 0;
            x1 = 1;
            System.out.print("Input Number: ");
            int x = input.nextInt();

            if (x == 1) {
                System.out.println(x0);
            }
            if (x >= 2) {
                System.out.printf("%d %d ", x0, x1);
            }
            if (x >= 3) {
                for (int i = 3; i <= x; i++) {
                    x2 = x1 + x0;
                    System.out.printf("%d ", x2);
                    x0 = x1;
                    x1 = x2;
                }
            }
        }
    }
}
