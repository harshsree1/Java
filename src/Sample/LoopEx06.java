package Sample;

import java.util.Scanner;

public class LoopEx06 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n =s.nextInt();

        int sum =0;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println("sum :" + sum);
    }
}
