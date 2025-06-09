public class Student {
    private String id;
    private String name;
    private double gpa;

    public void setDetails(String ID, String n, Double GPA) {
        id = ID;
        name = n;
        gpa = GPA;
    }

    public void showDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) throws Exception {
        Student sc1 = new Student();
        Student sc2 = new Student();

        sc1.showDetails();
        System.out.println();
        sc2.setDetails("34123", "TANS", 2.5);
        sc2.showDetails();
    }
}
