package gptRecommendation.Day08;

/*Task:
        1.	Create an abstract class called Vehicle with attributes brand and speed.
        2.	Add an abstract method move().
        3.	Create two subclasses, Car and Bike, that extend Vehicle.
	4.	Implement the move() method in each subclass:
        •	Car: Print "The car drives at 60 mph."
        •	Bike: Print "The bike pedals at 15 mph."
        5.	In the main method, create instances of Car and Bike, set their attributes, and call move().*/

/*The car drives at 60 mph.
The bike pedals at 15 mph.*/

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("tesla", 120,4);
        myCar.displayInfo();
        myCar.accelerate(200);
    }
}
