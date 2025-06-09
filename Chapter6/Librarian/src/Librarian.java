public class Librarian {
    public static void main(String[] args) throws Exception {
        Student st1;
        LibraryCard card1, card2;
        st1 = new Student();
        st1.setName("Jon Java");
        st1.setEmail("jj@java.com");

        card1 = new LibraryCard();
        card1.setOwner(st1);

        card1.checkOut(3);

        card2 = new LibraryCard();
        card2.setOwner(st1);

        System.err.println("Card1 Info: ");
        System.out.println(card1.toString() + "\n");
        System.out.println("Card2 Info: ");
        System.out.println(card2.toString() + "\n");
    }
}
