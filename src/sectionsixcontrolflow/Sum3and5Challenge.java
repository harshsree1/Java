package sectionsixcontrolflow;

public class Sum3and5Challenge {
    public static void main(String[] args) {
        /*int countOfMatches = 0;
        int sumOfMatches = 0;


        for (int loopNumber = 1; loopNumber <= 1000; loopNumber++) {


        if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)) {
            countOfMatches++;
            sumOfMatches += loopNumber;
            System.out.println("found a match =" + loopNumber);
        }
        if (countOfMatches == 5) {
            break;
        }
        }
        System.out.println("Sum="+ sumOfMatches);*/
        int count=0;
        int sum =0;

        for(int i =1; i<=100; i++){
            if((i % 3 == 0) &&(i % 5 ==0)){
                count++;
                sum += i;
                System.out.println(i);
            }
            if (count ==5){
              break;
            }
        }
        System.out.println(sum);
    }

}
