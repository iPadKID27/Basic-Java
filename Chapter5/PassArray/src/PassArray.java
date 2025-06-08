import java.util.Scanner;

public class PassArray {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 4;
        int[] numbers = new int[ARRAY_SIZE];
        getValues(numbers);

        System.out.println("Here are the " + " number that you entered: ");
        showArray(numbers);
    }

    public static void getValues(int[] array) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a series of " + array.length + " number.");
            for (int index = 0; index < array.length; index++) {
                System.out.print("Enter number " + (index + 1) + ": ");
                array[index] = input.nextInt();
            }
        }
    }

    public static void showArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + "   ");
        }
    }
}
