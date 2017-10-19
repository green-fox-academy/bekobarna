package Twentyplusone;

import java.util.*;

public class Game {
    static Deck deck = new Deck();

    public static void main(String[] args) {
        System.out.println("Welcome to the game!\n Do you want to play? [Y/N]");

        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();

        while (true) {
            if (Objects.equals(answer, "N")) {
                break;
            } else {
                deck.shuffle();

            }
        }
    }

    public int opponentScore() {
        return 15 + (int)(Math.random() * ((21 - 15) + 1));
    }

}
