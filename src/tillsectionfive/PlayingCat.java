package tillsectionfive;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 36));
    }
    public static boolean isCatPlaying (boolean summer, int temp) {
     if(summer && temp>=25 && temp<=45){
         return true;
     } return !summer && temp>=25 && temp<=35;
         
     }
}
