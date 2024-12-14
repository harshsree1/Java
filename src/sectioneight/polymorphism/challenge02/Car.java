package sectioneight.polymorphism.challenge02;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine=true;
        this.wheels=4;
    }
    public String startEngine(){
        return "Car -> Engine is starting";
    }
    public String accelerate(){
        return "Car -> Engine is accelerating";
    }
    public String brake(){
        return "Car -> Engine is braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return "Mitsubishi -> Engine is starting";
    }
    @Override
    public String accelerate(){
        return "Mitsubishi -> Engine is accelerating";
    }
    @Override
    public String brake(){
        return "Mitsubishi -> Engine is braking";
    }
}
class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return "Holden -> Engine is starting";
    }
    @Override
    public String accelerate(){
        return "Holden -> Engine is accelerating";
    }
    @Override
    public String brake(){
        return "Holden -> Engine is braking";
    }
}
class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return "Ford -> Engine is starting";
    }
    @Override
    public String accelerate(){
        return "Ford -> Engine is accelerating";
    }
    @Override
    public String brake(){
        return "Ford -> Engine is braking";
    }

}
