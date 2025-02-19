package gptRecommendation.Day04;

class Car extends Vehicle {
    private final int doors;
    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + ", Doors: " + doors);
    }
}
