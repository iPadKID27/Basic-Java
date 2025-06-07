import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter purchase amount: ");
            double purchaseAmount = input.nextDouble();
            double tax = purchaseAmount * 0.07;
            double finalTax = (int)(tax * 100) / 100.0;
            double totalPrice = purchaseAmount + finalTax;
            System.out.println("Salse tax is " + finalTax);
            System.out.println("Total price is: " + totalPrice);
        }
    }
}
