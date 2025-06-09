public class ConstructorDemo2 {
    public static void main(String[] args) {
        Rectangle610 boxA = new Rectangle610();
        Rectangle610 boxB = new Rectangle610(3.0, 2.0);
        System.out.println("The box A area is " + boxA.getArea());
        System.out.println("The box B area is " + boxB.getArea());
    }
}
