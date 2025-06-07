public class LoopCall {
    public static void main(String[] args) {
        System.out.println("Hello from the main method.");
        for (int i = 0; i < 5; i++) {
        diaplayMessage();
        }
        System.out.println("Back in the main method.");
    }

    public static void diaplayMessage() {
        System.out.println("Hello from the displayMessage");
    }
}
