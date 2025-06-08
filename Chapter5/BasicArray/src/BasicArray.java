public class BasicArray {
    public static void main(String[] args) {
        final int LIMIT = 15, MULTIPLE = 10;

        int[] lsit = new int[LIMIT];
        for (int index = 0; index < LIMIT; index++) {
            lsit[index] = index * MULTIPLE;
        }
        lsit[5] = 999;
        for (int value : lsit) {
            System.out.print(value + "  ");
        }
    }
}