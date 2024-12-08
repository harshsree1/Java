package dailiyPractice.day00;

public class BankAccount {

    public static void main(String[] args) {

        BankAccount ba =new BankAccount("123456","Harsha", 100.0);
        ba.deposit(1000);
        ba.withdraw(250);
        ba.displayAccountDetails();

    }
    private String accountNumber ;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }
    public void deposit(double amount){

        balance=balance+amount;
        System.out.println("Account balance after adding amount = "+balance);
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient balance for withdrawal!");
        } else {
            balance = balance - amount;
            System.out.println("Account balance after withdraw amount = " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountDetails(){
        System.out.println(accountNumber);
        System.out.println(accountHolder);
        System.out.println("Current Balance ="+balance);
    }
}
