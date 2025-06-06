package Sample;

import java.util.Scanner;

public class LoopEx05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int max = n;
        int min = n;


        while(true){
            n=s.nextInt();

            if(n < 0) {
                System.out.println("Negative input is not allowed: " + n);
                break;
            }
            if (n > max)
                max = n;

            if (n < min)
                min = n;
        }
        System.out.println("max :"+ max +", "+"min :"+min);
    }
}
