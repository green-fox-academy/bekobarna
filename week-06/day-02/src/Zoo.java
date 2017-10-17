import main.java.animals.*;

public class Zoo {
    public static void main(String[] args) {
        Reptile reptile = new Reptile("Crocodile", 10, "male", 23);
        Mammal mammal = new Mammal("Koala", 5, "female", 78);
        Bird bird = new Bird("Parrot", 33, "female", 12);

        System.out.println("Who want a baby?");
        System.out.println(reptile.getName() + " " + reptile.wantChild());
        System.out.println(mammal.getName() + " " + mammal.wantChild());
        System.out.println(bird.getName() + " " + bird.wantChild());

        System.out.println("\nWhat do you want to eat?");
        System.out.println(reptile.getName() + " " + reptile.eat());
        System.out.println(mammal.getName() + " " + mammal.eat());
        System.out.println(bird.getName() + " " + bird.eat());

        System.out.println("\nWhat dou you say?");
        System.out.println(reptile.getName() + " " + reptile.greet());
        System.out.println(mammal.getName() + " " + mammal.greet());
        System.out.println(bird.getName() + " " + bird.greet());
    }
}