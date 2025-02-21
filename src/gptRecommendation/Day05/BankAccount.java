package gptRecommendation.Day05;

/*
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
*/


class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message){
        super(message);
    }
}
 class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException(" Deposit amount cannot be negative");
        }
        balance +=amount;
        System.out.println("Deposit successful. New amount is : " + balance);
    }
    public void withdraw (double amount) throws InsufficientFundsException {
        if(amount > balance) {
            throw new InsufficientFundsException("Insufficient funds available. Available balance is: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance is : " + balance);
    }
}
