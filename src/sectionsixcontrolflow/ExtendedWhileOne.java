package sectionsixcontrolflow;

public class ExtendedWhileOne {
    public static void main(String[] args){
        int FirstNumber =4;
        int LastNumber=20;
        int EvenCount=0;
        int OddCount=0;
        while(FirstNumber<=LastNumber){
            FirstNumber++;
            if(!isEvenNumber(FirstNumber)) {
                OddCount++;
                continue;
            }
            System.out.println("Even Number = "+FirstNumber);
            EvenCount++;
            if(EvenCount>=5){
                break;
            }
        }

        System.out.println("Total Number of Even Numbers = "+EvenCount);
        System.out.println("Total Number of Odd Numbers = "+OddCount);
    }
    public static boolean isEvenNumber(int number){
        if((number%2) == 0){
            return true;
        } else {
            return false;
        }
    }
}
