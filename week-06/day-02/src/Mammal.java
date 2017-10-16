public class Mammal extends Animal {

    public Mammal(String name, int age, String gender, int height) {
        super(name, age, gender, height);
    }

    @Override
    public void greet() {
    }

    @Override
    public String wantChild() {
        return "want child from my uterus!";
    }

    @Override
    public void eat() {
    }

    @Override
    public String getName() {
        return name;
    }
}
