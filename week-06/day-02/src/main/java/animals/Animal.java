package main.java.animals;

public abstract class Animal {
    String name;
    int age;
    String gender;
    int height;
    boolean usesEggs;

    public Animal(String name, int age, String gender, int height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.usesEggs = false;
    }

    public abstract String greet();

    public String wantChild() {
        if (this.usesEggs) {
            return "want a child from an egg!";
        } else {
            return "want child from my uterus!";
        }
    };

    public abstract String eat();

    public String getName() {
        return name;
    };

}
