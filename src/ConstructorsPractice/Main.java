package ConstructorsPractice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Account bobsAccount = new Account("12345", 500.00, "Bob Brown", "myemail@bob.com","(9)25)79839");
        Account bobsAccount = new Account();
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(1000);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("myemail@bob.com");
//        bobsAccount.setCustomerPhone("(9)25)79839");
        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250.0);
        bobsAccount.withdrawFunds(50);
        bobsAccount.withdrawFunds(200);
        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        Account timsAccount = new Account("Tim", "tim@email.com", "12354");
        System.out.println("AccountNo:"+timsAccount.getNumber()+"; name "+ timsAccount.getCustomerName());

    }


}