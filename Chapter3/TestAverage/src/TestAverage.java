import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        int score1, score2, score3;
        double average;
        char repeat;
        String input;
        
        System.out.println("This program calculates the " + 
        "average of three test scores.");

        try (Scanner keyboard = new Scanner(System.in)) {
            do {
                System.out.print("Enter score #1: ");
                score1 = keyboard.nextInt();

                System.out.print("Enter score #2: ");
                score2 = keyboard.nextInt();

                System.out.print("Enter score #3: ");
                score3 = keyboard.nextInt();

                keyboard.nextLine();

                average = (score1 + score2 + score3) / 3.0;
                System.out.println("The average is " + average);
                System.out.println();

                System.out.println("Would you like to average " +
                "another set of test scores?");
                System.out.print("Enter Y for yesy or N for no: ");
                input = keyboard.nextLine();
                repeat = input.charAt(0);
            } while (repeat == 'Y' || repeat == 'y');
        }
    }
}
