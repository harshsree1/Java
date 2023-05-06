package sectionsixcontrolflow;

public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(10);
        printNumberInWord(-3);

    }
    public static void printNumberInWord(int number){
      String wholeNumber= switch(number){
          case 0->{yield "ZERO";}
          case 1->"ONE";
          case 2->"TWO";
          case 3->"THREE";
          case 4->"FOUR";
          case 5->"FIVE";
          case 6->"SIX";
          case 7->"SEVEN";
          case 8->"EIGHT";
          case 9->"NINE";
          case 10->"TEN";
          default -> "Invalid Number";
      };
        System.out.println(number+" is whole number and it spelled as "+wholeNumber);
    }
}
