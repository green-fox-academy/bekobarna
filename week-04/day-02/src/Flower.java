public class Flower extends Garden {

    public Flower(String color, int currentWater) {
        this.color = color;
        this.currentWater = currentWater;
    }

    public void status() {
        if (currentWater < 5) {
            System.out.println("The " + color + " Flower needs water");
        } else {
            System.out.println("The " + color + " Flower doesn`t need water");
        }
    }

    public void wateringFlower (int wateringAmount) {
        if (currentWater < 5) {
            currentWater += (wateringAmount * 0.75);
        }
    }

}
