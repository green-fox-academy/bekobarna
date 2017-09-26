import java.util.ArrayList;

public class Garden {
    String color;
    int currentWater;
    boolean thirst;
    int wateringAmount;

    static ArrayList<Tree> trees = new ArrayList<>();
    static ArrayList<Flower> flowers = new ArrayList<>();


    public void treeAdd (Tree tree) {
        trees.add(tree);
    }

    public void flowerAdd (Flower flower) {
        flowers.add(flower);
    }



    public void watering (int waterInput) {
        System.out.println("Watering with " + waterInput);



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



    }

}
