package Sample;

import java.util.Scanner;

public class LoopEx08 {
    public static void main(String[] args) {

        System.out.print(" Enter any value to add space for each letter :");

        Scanner s = new Scanner(System.in);

        String str = s.nextLine();


        for ( int i = 0;  i <= str.length() - 1; i++)
            System.out.print(str.charAt(i)+ " ");
    }
}
