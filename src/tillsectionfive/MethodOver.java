package tillsectionfive;

public class MethodOver {
    public static void main(String[] args) {
        System.out.println("5ft and 12 inches= "+convertToCentimeters(5,12) );
        System.out.println("48 inches= "+convertToCentimeters(48));
    }

    public static double convertToCentimeters(int inches) {
        return inches*2.54;
    }
    public static double convertToCentimeters(int foot, int inches) {
        return convertToCentimeters((foot*12)+inches);
    }
}
