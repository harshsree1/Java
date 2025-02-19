package gptRecommendation.Day04;

class Bike extends Vehicle{
    private final boolean kickStart;
    public Bike(String brand, int speed, boolean kickStart) {
        super(brand, speed);
        this.kickStart = kickStart;
    }
    @Override
    public void displayInfo(){
        System.out.println("Brand: " + brand + ", Speed: " + speed + ", kickStart: " + kickStart);
    }
}
