package gptRecommendation.Day02;

public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("GenericAnimal");
        genericAnimal.makeSound();

        Dog dog =new Dog("Buddy");
        dog.makeSound();
        dog.fetch();
    }
}
