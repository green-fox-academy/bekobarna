package main.java.animals;

public class Reptile extends Animal {

    public Reptile(String name, int age, String gender, int height) {
        super(name, age, gender, height);
        this.usesEggs = true;
    }

    @Override
    public String greet() {
        return "says sssssssss";
    }

    @Override
    public String eat() {
        return "likes to eat little animals";
    }
}
