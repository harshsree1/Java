package Sample;

import java.util.Scanner;

public class LoopEx07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print(" enter a positive integer n: ");
        int n = s.nextInt();

        long result = 0;
        long v1 = 1;
        long v2 = 1;
        for (int i =1; i <= n-2; i++){
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }
        System.out.println(" result :"+(result ==0 ? 1 : result));
    }
}
