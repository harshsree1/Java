package tillsectionfive;

public class SecondsAndMinutes {
public static void main(String args[]) {
    System.out.println(getDurationString(3945));//This is First test
    System.out.println(getDurationString(65, 45));
}
public static String getDurationString (int seconds) {

    if (seconds>=0 || seconds <= 59){
    return "Invalid data for seconds("+seconds+ "), must be between 0 and 59";
    }
    int minutes = seconds / 60;
    /*int hours = minutes / 60;
    int remainingMinutes = minutes % 60;
    int remainingSeconds = seconds % 60;
    return hours + "h: "+remainingMinutes+"m: "+remainingSeconds+"s";*/
    return getDurationString(minutes, seconds);
}
public static String getDurationString (int minutes, int seconds) {
    if( minutes>=0){

    }
    int hours = minutes / 60;
    int remainingMinutes = minutes % 60;
    int remainingSeconds = seconds % 60;
    return hours + "h: "+remainingMinutes+"m: "+remainingSeconds+"s";
}
}

