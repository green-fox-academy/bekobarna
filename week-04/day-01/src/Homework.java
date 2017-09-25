public class Homework {
    String type;
    String leafColor;
    int age;
    String sex;

    public Homework(String type, String leafColor, int age, String sex) {
        this.type = type;
        this.leafColor = leafColor;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {
        Homework birch = new Homework("birch", "grass green", 14, "male");
        Homework palm = new Homework("palm", "dark green", 2, "female");
        Homework pine = new Homework("pine", "grey", 62, "male");
        Homework apple = new Homework("apple", "yellow", 10, "female");
        Homework giantSequoia = new Homework("giant sequioa", "green", 394, "female");
        System.out.println(birch.type + " " + birch.leafColor + " " + birch.age + " " + birch.sex);

    }
}
