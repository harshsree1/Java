package Sample;

import java.util.Scanner;

public class LoopEx05New {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int max = n;
        int min = n;

        if(n >=0) {
            while (true) {
                n = s.nextInt();

                if (n < 0)
                    break;

/*                if (n > max)
                    max = n;

                if (n < min)
                    min = n;*/
                max = n > max ? n : max;
                min = n < min ? n : min;

            }
            System.out.println("max :" + max + ", " + "min :" + min);
        } else
            System.out.println(n + " is invalid");
    }

}
