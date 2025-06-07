import java.util.Scanner;

public class TestGrade {
    public static void main(String[] args) {
        int testScore;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your numeric test score and I will tell you the grede: ");
            testScore = input.nextInt();
        }
        if (testScore < 60) {
            System.out.println("Your grede is F. ");
        } else if (testScore < 70) {
            System.out.println("Your grade is D. ");
        } else if (testScore < 80) {
            System.out.println("Your grade is C. ");
        } else if (testScore < 90) {
            System.out.println("Your grade is B. ");
        } else if (testScore <= 100) {
            System.out.println("Your grade is A. ");
        } else  {
            System.out.println("Invalid score. ");
        }
    }
}
