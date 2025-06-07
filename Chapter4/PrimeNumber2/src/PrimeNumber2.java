import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int x;
            System.out.print("Input Number: ");
            x = input.nextInt();
            System.out.println("========");
            for (int i = 2; i <= x; i++) {
                if (isPrimeNumber(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean isPrimeNumber(int number) {
        boolean status = true;
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                status = false;
                break;
            }
        }
        return status;
    }
}
