package sectionseven.POJO;

public class Main {
    public static void main(String[] args) {
        for (int i=0; i <=5; i++){
            Student s =new Student("S92344"+ i,
                    switch(i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "TIM";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymus";
                    },
                    "11/09/1985",
                    "Java Master Class");
            System.out.println(s);
        }
    }
}
