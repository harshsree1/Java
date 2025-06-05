package Sample;

import java.util.Scanner;

public class LoopEx04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = s.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < n; i++)
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        if (n<=1){
            System.out.println("Given number is not prime");
        } else if (isPrime) {
            System.out.println("Given number is prime");
        } else {
            System.out.println("Given number is not prime");
        }
    }
}
