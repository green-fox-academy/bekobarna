public abstract class Animal {
    String name;
    int age;
    String gender;
    int height;

    public Animal(String name, int age, String gender, int height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public abstract void greet();

    public abstract String wantChild();

    public abstract void eat();

    public abstract String getName();

}
