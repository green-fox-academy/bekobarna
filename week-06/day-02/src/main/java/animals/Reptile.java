package main.java.animals;

public class Reptile extends Animal {

    public Reptile(String name, int age, String gender, int height) {
        super(name, age, gender, height);
    }

    @Override
    public String greet() {
        return "says sssssssss";
    }

    @Override
    public String wantChild() {
        return "want a child form an egg!";
    }

    @Override
    public String eat() {
        return "likes to eat little animals";
    }
}
