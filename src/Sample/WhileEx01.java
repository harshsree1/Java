package Sample;

public class WhileEx01 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100){
            if(i % 2 == 0)
                System.out.print(i + " ");
            i ++;
        }
    }
}
