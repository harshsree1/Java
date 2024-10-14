package sectionseven;

public class AboutString {
    public static void main(String[] args) {
    printInformation("Hello World");
        printInformation("  ");
    }
    public static void printInformation(String string){
        int length=string.length();
        System.out.printf("Length = %d %n", length);
        if(string.isEmpty()){
            System.out.println("String is Empty");
            return;
        }
         if(string.isBlank()){
             System.out.println("string is Blank");
             return;
         }

        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("First char = %c %n", string.charAt(length-1));
        System.out.printf("index of H = %c %n", string.indexOf('H'));
    }
}
