package sectionsixcontrolflow;

public class WhileOne {
    public static void main(String[] args){
    int number =4;
    int LastNumber=20;
    while(number<=LastNumber){
     number++;
     if(!isEvenNumber(number)){
         continue;
     }System.out.println("Even Number ="+number);
    }
    }
    public static boolean isEvenNumber(int number){
        if((number%2) == 0){
            return true;
        } else {
            return false;
        }
    }
}
