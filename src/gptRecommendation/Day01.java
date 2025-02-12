package gptRecommendation;

import java.util.Scanner;

public class Day01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        int firstNum = scanner.nextInt();
        System.out.print("Enter the second num: ");
        int secondNum = scanner.nextInt();
        System.out.print("Enter the Operator (+, -, *, /): ");
        String operator = scanner.next();
        scanner.close();

        System.out.println("Result: " + calculates(firstNum, secondNum, operator));
    }

    private static String calculates(int firstNum, int secondNum, String operator) {
        switch (operator) {
            case "+" -> {
                return String.valueOf(firstNum + secondNum);
            }
            case "-" -> {
                return String.valueOf(firstNum - secondNum);
            }
            case "*" -> {
                return String.valueOf(firstNum * secondNum);
            }
            case "/" -> {
                if (secondNum == 0) {
                    return "Error: Division by zero is not allowed";
                }
                return String.valueOf((double) firstNum / secondNum); // Ensuring division returns decimal values
            }
            default -> {
                return "Invalid Operator";
            }
        }
    }
}