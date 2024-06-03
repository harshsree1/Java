public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(10);
        printNumberInWord(11);
        printNumberInWord(-3);
    }

    public static void printNumberInWord(int number) {
        String wholeNumber;
        switch (number) {
            case 0:
                wholeNumber = "ZERO";
                break;
            case 1:
                wholeNumber = "ONE";
                break;
            case 2:
                wholeNumber = "TWO";
                break;
            case 3:
                wholeNumber = "THREE";
                break;
            case 4:
                wholeNumber = "FOUR";
                break;
            case 5:
                wholeNumber = "FIVE";
                break;
            case 6:
                wholeNumber = "SIX";
                break;
            case 7:
                wholeNumber = "SEVEN";
                break;
            case 8:
                wholeNumber = "EIGHT";
                break;
            case 9:
                wholeNumber = "NINE";
                break;
            case 10:
                wholeNumber = "TEN";
                break;
            default:
                wholeNumber = "Invalid Number";
        }
        System.out.println(number + " is whole number and it spelled as " + wholeNumber);
    }
}
