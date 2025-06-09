import java.util.Scanner;

public class Cal_Max {
    public static void main(String[] args) throws Exception {
        int num1, num2;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input Number 1: ");
            num1 = input.nextInt();
            System.out.print("Input Number 2: ");
            num2 = input.nextInt();
        }
        int larger = TestMax.max(num1, num2);
        System.out.println("Max Date is " + larger);
    }
}

class TestMax {
    static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    
}