package sectioneight.polymorphism.challenge;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }
    public void startEngine(){
        System.out.println("Car -> startEngine");
    }
    protected void runEngine(){
        System.out.println("Car -> runEngine");
    }
    public void drive(){
        System.out.println("Car -> driving, this is "+ getClass().getSimpleName());
        runEngine();
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cylinders =6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> Usage exceeds the average: %.3f %n", avgKmPerLiter);
    }
}
