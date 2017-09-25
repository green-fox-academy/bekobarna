//    You have a Dice class which has 6 dice
//    You can roll all of them with roll()
//    Check the current rolled numbers with getCurrent()
//    You can reroll with reroll()
//    Your task is to get where all dice is a 6

import java.util.Arrays;

public class Dice {

    int[] dices = new int[6];

    public int[] roll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
        return dices;
    }

    public int[] getCurrent() {
        return dices;
    }

    public int getCurrent(int i) {
        return dices[i];
    }

    public void reroll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
    }

    public void reroll(int k) {
        dices[k] = (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        Dice myDice = new Dice();
        myDice.getCurrent();
        myDice.roll();
        myDice.getCurrent();
        myDice.getCurrent(5);
        myDice.reroll();
        myDice.getCurrent();
        myDice.reroll(4);
        myDice.getCurrent();

        while (myDice.getCurrent(0) != 6 || myDice.getCurrent(1) != 6 || myDice.getCurrent(2) != 6 || myDice.getCurrent(3) != 6
            || myDice.getCurrent(4) != 6 || myDice.getCurrent(5) != 6) {
            myDice.reroll();
            System.out.println(Arrays.toString(myDice.getCurrent()));

        }
    }
}