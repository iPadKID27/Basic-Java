import java.util.Scanner;

public class TokenTest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a sentence and press Enter: ");
            String sentence = input.nextLine();
            String[] tokens = sentence.split(" ");
            System.out.printf("Number of element: %d%nThe tokens are:%n", tokens.length);
            for (String token : tokens) {
                System.out.print(token);
                System.out.print(" ");
            }
        }
    }
}
