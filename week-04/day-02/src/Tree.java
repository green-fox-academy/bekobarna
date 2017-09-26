public class Tree extends Garden {

    public Tree(String color, int currentWater) {
        this.color = color;
        this.currentWater = currentWater;
    }

    public void status() {
        if (currentWater < 10) {
            System.out.println("The " + color + " Tree needs water");
        } else {
            System.out.println("The " + color + " Tree doesn`t need water");
        }
    }

    public void wateringTree (int wateringAmount) {
        if (currentWater < 10) {
            currentWater += (wateringAmount * 0.4);
        }
    }

}
