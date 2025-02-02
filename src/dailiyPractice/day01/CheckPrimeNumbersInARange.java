package dailiyPractice.day01;

/*Ask the user to input a number N.
Use a nested for loop:
The outer loop checks each number from 2 to N.
The inner loop determines whether the current number has divisors other than 1 and itself.
If a number is prime, print it.*/

import java.util.Scanner;

import static sectionsixcontrolflow.PrimeNumberChallange.isPrime;

public class CheckPrimeNumbersInARange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start of Range: ");
        int start = scanner.nextInt();
        System.out.println("Enter the end of Range ");

        int end = scanner.nextInt();
        scanner.close();

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false; // Numbers less than 2 are not prime
        if (num == 2) return true; // 2 is the only even prime number
        if (num % 2 == 0) return false; // Skip even numbers

        // Check divisibility from 3 to sqrt(num), skipping even numbers
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false; // If divisible, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }

}
