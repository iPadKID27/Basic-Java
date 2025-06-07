import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int x;
            System.out.print("Input Data: ");
            x = input.nextInt();
            Bar(x);
        }
    }

    public static void Bar(int data) {
        for (int x = 1; x <= data; x++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
