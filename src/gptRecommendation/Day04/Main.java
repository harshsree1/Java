package gptRecommendation.Day04;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota", 150, 4);
        Vehicle myBike = new Bike ("Bajaj", 125,false);
        myCar.displayInfo();
        myBike.displayInfo();
    }
}
