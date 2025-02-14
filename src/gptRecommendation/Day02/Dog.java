package gptRecommendation.Day02;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
void makeSound() {
        System.out.println("Woof! Woof!");
    }
    void fetch(){
        System.out.println("Fetching the ball");
    }
}
