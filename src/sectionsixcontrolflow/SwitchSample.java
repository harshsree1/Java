package sectionsixcontrolflow;
public class SwitchSample {
    public static void main(String[] args) {
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
    }
//   public static void printWeekDay(int day){
//        String dayOfWeek =switch (day){
//            case 0-> { yield "Sunday";}
//            case 1-> "Monday";
//            case 2-> "Tuesday";
//            case 3-> "Wednesday";
//            case 4-> "Thursday";
//            case 5-> "Friday";
//            case 6-> "Saturday";
//            default -> "Invalid day";
//        };
//       System.out.println(day+" Stands for "+dayOfWeek);
//   }

    public static void printWeekDay(int day) {
        String dayOfWeek ="Invalid Day";
        if(day==0){
            dayOfWeek="SUNDAY";
        } else if (day==1) {
            dayOfWeek="MONDAY";
        } else if (day==2) {
           dayOfWeek="TUESDAY";
        } else if (day==3) {
           dayOfWeek="WEDNESDAY";
        }else if(day==4){
            dayOfWeek="Thursday";
        }else if(day==5){
            dayOfWeek="Friday";
        } else if (day==6) {
            dayOfWeek="Saturday";
        }
        System.out.println(day+" Stands for "+dayOfWeek);
    }
}
