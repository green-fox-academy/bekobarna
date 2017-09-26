public class Flower {
    String color;
    int currentWater;
    boolean thirst;

    public Flower(String color, int currentWater) {
        this.color = color;
        this.currentWater = currentWater;
    }

    public void thirsty () {
        if (currentWater < 5) {
            thirst = true;
        }
    }

    /*public void watering (int waterInput) {
        System.out.println("Watering with " + waterInput);
        currentWater +=waterInput;
    }*/

}
