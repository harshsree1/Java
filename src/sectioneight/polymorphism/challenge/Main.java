package sectioneight.polymorphism.challenge;

public class Main {
    public static void main(String[] args) {
    Car car =new Car("2022 Blue Ferrari 296 GST");
    runRace(car);
    Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4,6);
        runRace(ferrari);
    Car tesla =new ElectricCar("2023 red Model y", 568,75);
        runRace(tesla);
    Car ferrari01 =new HybridCar("Ferrari new mode",15, 8, 8);
    runRace(ferrari01);
    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
