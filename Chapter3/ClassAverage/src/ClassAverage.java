import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int total = 0;
            int counter = 1;
            while (counter <= 10) {
                System.out.print("Enter grade: ");
                int grade = input.nextInt();
                total = total + grade;
                counter = counter + 1;
            }
            int average = total/10;
            System.out.printf("%nTotal of all 10 grades is %d\n" , total);
            System.out.printf("Class average is %d%n" , average);
        }
    }
}
