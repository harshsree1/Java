package gptRecommendation.Day04;

public abstract class Vehicle {
    public String brand;
    public int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo(){
        System.out.println("Brand: " + brand + ", Speed: " + speed + "km/h");
    }

}
