import java.util.ArrayList;
import java.util.List;

public class Garden {

    String color;
    int currentWater;
    static List<Tree> trees = new ArrayList<>();
    static List<Flower> flowers = new ArrayList<>();

    public static void main(String[] args) {
        Flower yellow = new Flower("yellow", 3);
        flowers.add(yellow);
        Flower blue = new Flower("blue", 2);
        flowers.add(blue);
        Tree purple = new Tree("purple", 1);
        trees.add(purple);
        Tree orange = new Tree("orange", 6);
        trees.add(orange);

        for (int i = 0; i < trees.size(); i++) {
            trees.get(i).status();
            flowers.get(i).status();
        }

        System.out.println("");
        System.out.println("Watering with 40");
        for (int i = 0; i < trees.size(); i++) {
            if (trees.get(i).currentWater < 10) {
                trees.get(i).wateringTree(40);
            }
            for (int j = 0; j < flowers.size(); j++) {
                if (flowers.get(j).currentWater < 5) {
                    flowers.get(j).wateringFlower(40);
                }
            }
        }

        for (int i = 0; i < trees.size(); i++) {
            trees.get(i).status();
            flowers.get(i).status();
        }

        System.out.println("");
        System.out.println("Watering with 70");
        for (int i = 0; i < trees.size(); i++) {
            if (trees.get(i).currentWater < 10) {
                trees.get(i).wateringTree(40);
            }
            for (int j = 0; j < flowers.size(); j++) {
                if (flowers.get(j).currentWater < 5) {
                    flowers.get(j).wateringFlower(40);
                }
            }
        }

        for (int i = 0; i < trees.size(); i++) {
            trees.get(i).status();
            flowers.get(i).status();
        }



    }

}