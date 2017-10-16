public class Bird extends Animal{


    public Bird(String name, int age, String gender, int height) {
        super(name, age, gender, height);
    }

    @Override
    public void greet() {
    }

    @Override
    public String wantChild() {
        return "want a child from an egg!";
    }

    @Override
    public void eat() {
        System.out.println("likes to eat seeds");
    }

    @Override
    public String getName() {
        return name;
    }
}
