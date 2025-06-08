public class SumArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int value : list) {
            sum += value;
        }
        System.out.print("Sum = " + sum);
    }
}
