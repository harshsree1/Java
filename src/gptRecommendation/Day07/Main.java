package gptRecommendation.Day07;

/*Task:
        1.	Create a base class called Animal with attributes name and age.
        2.	Add a method makeSound() that prints "Some generic animal sound".
        3.	Create two subclasses, Dog and Cat, that inherit from Animal.
        4.	Override the makeSound() method in each subclass to print "Bark" for Dog and "Meow" for Cat.
	5.	In the main method, create an instance of Dog and Cat, set their names and ages, and call makeSound().*/

/*Dog: Bark
Cat: Meow*/

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Pretty", 2);
        Cat myCat = new Cat("Flasha", 1);

        myDog.makeSound();
        myCat.makeSound();
    }
}
