package tillsectionfive;

public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        System.out.println(printYearAndDays(-561600));
    }
    public static String printYearAndDays (long minutes){

        if (minutes < 0){
            System.out.println("Invalid Value");
        }else {
            long years = (minutes / (60 * 24 * 365));
            long days = ((minutes) % (60 * 24 * 365)) / (60 * 24);

            return minutes + " min = " + years + " y and " + days + " d";
        }
        return null;
    }
}
