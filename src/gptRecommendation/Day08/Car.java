package gptRecommendation.Day08;

public class Car extends Vehicle{
    private int numberOfDoors;
    public Car(String brand, int speed, int numberOfDoors){
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("numberOfDoors: "+numberOfDoors);
    }
    @Override
    public void accelerate(int increment){
        System.out.println("Car is accelerating...");
        super.accelerate(increment);
    }

}
