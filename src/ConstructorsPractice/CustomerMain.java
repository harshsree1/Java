package ConstructorsPractice;

public class CustomerMain {
    public static void main(String[] args) {
        Customer cst1 = new Customer("Harsha", 100000.0, "newmail1@email1.com");
        System.out.println(cst1.getName());
        System.out.println(cst1.getCreditLimit());
        System.out.println(cst1.getEmailAddress());

        Customer cst2 = new Customer();
        System.out.println(cst2.getName());
        System.out.println(cst2.getCreditLimit());
        System.out.println(cst2.getEmailAddress());

        Customer cst3 = new Customer("joe", "myemail1@email1.com");
        System.out.println(cst3.getName());
        System.out.println(cst3.getCreditLimit());
        System.out.println(cst3.getEmailAddress());
    }
}
