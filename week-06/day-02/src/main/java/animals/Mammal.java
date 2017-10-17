package main.java.animals;

public class Mammal extends Animal {

    public Mammal(String name, int age, String gender, int height) {
        super(name, age, gender, height);
        this.usesEggs = false;
    }

    @Override
    public String greet() {
        return "growls";
    }

    @Override
    public String eat() {
        return "likes to eat anything";
    }
}
