package gptRecommendation.Day08;

public class Vehicle {
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }
    public void displayInfo( ){
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed+ " mph");
    }
    public void accelerate(int increment){
        if(this.speed + increment  > 200){
            this.speed = 200;
            System.out.println("Speed Limit Reached! Setting to 200 mph.");
        }else {
            this.speed +=increment;
            System.out.println("New Speed "+ this.speed + " mph");
        }
    }
}
