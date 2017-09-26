public class Tree {
    String color;
    int currentWater;
    boolean thirst;

    public Tree() {
    }


    public Tree(String color, int currentWater) {
        this.color = color;
        this.currentWater = currentWater;
    }

    public void thirsty () {
        if (currentWater < 10) {
            thirst = true;
        }
    }


}
