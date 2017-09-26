import java.util.ArrayList;
import java.util.List;

public class Garden extends Tree {
    int currentWater;
    int wateringAmount;

    static List<Tree> trees = new ArrayList<>();
    static List<Flower> flowers = new ArrayList<>();

    public Garden(String color, int currentWater) {
        super(color, currentWater);
    }


    public void watering (int waterInput) {
        System.out.println("Watering with " + waterInput);
        



        wateringAmount = waterInput;
        currentWater +=waterInput;
    }


    public static void main(String[] args) {

        Flower yellow = new Flower("yellow", 10);
        flowers.add(yellow);
        Flower blue = new Flower("blue", 3);
        flowers.add(blue);

        Tree purple = new Tree("purple", 50);
        trees.add(purple);
        Tree orange = new Tree("orange", 34);
        trees.add(orange);

        /*yellow.thirsty();
        blue.thirsty();
        purple.thirsty();
        orange.thirsty();

        if (yellow.thirst = true) {
            yellow.watering(40);
        }

        if (blue.thirst = true) {
            blue.watering(40);
        }

        if (purple.thirst = true) {
            purple.watering(40);
        }

        if (orange.thirst = true) {
            orange.watering(40);
        }*/

    }

}
