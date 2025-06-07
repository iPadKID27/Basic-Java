import java.util.Scanner;

public class TestSum {
    public static void main(String[] args) {
        int Sum = 0;
        int Num;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input Number: ");
            Num = input.nextInt();
        }
        for (int i = 1; i <= Num; i++) {
            Sum = Sum + i;
        }
        System.out.println("Sum = " + Sum);
    }
}
