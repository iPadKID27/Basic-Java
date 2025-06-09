public class Constructor {
    public static void main(String[] args) throws Exception {
        Rectangle2 box = new Rectangle2(8.0, 12.0);
        System.out.println("The box's length is " + box.getLength());
        System.out.println("The box's width is " + box.getWidth());
        System.out.println("The box's area is " + box.getArea());
    }
}