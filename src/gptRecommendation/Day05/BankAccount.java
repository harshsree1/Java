package gptRecommendation.Day05;

public class BankAccount {
    private double balance;

    public void deposit (double amount){
        balance += amount;
        System.out.println("Deposit successful: new balance "+ balance);
    }
    public void withdraw(double amount){
        double withdraw = balance - amount;
        if(withdraw <0){
            System.out.println("Exception: Insufficient funds! Available balance: "+ balance);
            return;
        }
        System.out.println("Withdraw successful: new balance "+ withdraw);
    }

}

