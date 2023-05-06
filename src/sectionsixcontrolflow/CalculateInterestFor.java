package sectionsixcontrolflow;

public class CalculateInterestFor {
    public static void main(String[] args) {
//        System.out.println("10000 at 2% interest will be "+calculateInterest(10000,2));
        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("100 at " + rate + "% interest= " + interestAmount);
        }
    }
        public static double calculateInterest ( double amount, double interestRate){
            return (amount * (interestRate / 100));
        }
    }

