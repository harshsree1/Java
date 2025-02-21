package gptRecommendation.Day05;

/*public class Main {
    public static void main (String[] args){
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(500);
        myAccount.withdraw(700);
    }
}*/

public class Main{
    public static void main(String[] args) {
        BankAccount myAccount =  new BankAccount(500);
        try {
            myAccount.deposit(200);
            myAccount.withdraw(800);
        } catch (InsufficientFundsException e ) {
            System.out.println("Exception: "+e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(" Exception: "+e.getMessage());
        }
    }
}