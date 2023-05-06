package sectionsixcontrolflow;

public class LoopBreakStatement {
    public static void main(String[] args) {
     for (double rate=2.0; rate<= 5.0;rate++){
         double interestAmount = calculateInterest(100.00, rate);
         if(interestAmount>4){
             break;
         }
         System.out.println("$100.00 at"+rate+"% ineterst = $"+interestAmount);
     }
    }
    public static double calculateInterest(double amount, double rate){
        return(amount*(rate/100));
    }
}
