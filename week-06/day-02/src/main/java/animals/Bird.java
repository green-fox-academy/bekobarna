package main.java.animals;

public class Bird extends Animal {

    public Bird(String name, int age, String gender, int height) {
        super(name, age, gender, height);
        this.usesEggs = true;
    }

    @Override
    public String greet() {
        return "chirps";
    }

    @Override
    public String eat() {
        return "likes to eat seeds";
    }
}
