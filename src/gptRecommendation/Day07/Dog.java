package gptRecommendation.Day07;

public class Dog extends Animal{
    public Dog(String name, int age){
        super(name, age);
    }
    @Override
    public void makeSound(){
        System.out.println("Dog ("+name+") Bark");
    }
}
