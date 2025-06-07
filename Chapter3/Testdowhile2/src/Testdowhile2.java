import java.util.Scanner;

public class Testdowhile2 {
    public static void main(String[] args) {
        int num;
        try (Scanner input = new Scanner(System.in)) {
            do {
                System.out.print("Enter the number: ");
                num = input.nextInt();
            } while (num > 100);
        }
    }
}
