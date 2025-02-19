package gptRecommendation.Day04;

/*Task:

Create a base class Vehicle with attributes like brand, speed, and a method displayInfo(). Then, create two subclasses Car and Bike that inherit from Vehicle and override the displayInfo() method to provide specific details.

Requirements:
        1.	Use constructors to initialize the attributes.
        2.	Demonstrate method overriding in the subclasses.
        3.	In the main method, create instances of Car and Bike, then call displayInfo() to observe polymorphism.*/


public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota", 150, 4);
        Vehicle myBike = new Bike ("Bajaj", 125,false);
        myCar.displayInfo();
        myBike.displayInfo();
    }
}
