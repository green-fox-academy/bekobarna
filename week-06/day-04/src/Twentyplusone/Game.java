package Twentyplusone;

import Twentyplusone.Card.Color;
import Twentyplusone.Card.Rank;
import Twentyplusone.Card.Suit;
import java.util.*;

public class Game {
    Deck deck = new Deck(Color.randomColor(), Suit.randomSuit(), Rank.randomRank());


    public static void main(String[] args) {
        System.out.println("Welcome to the game!\n Do you want to play? [Y/N]");

        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();

        while (true) {
            if (Objects.equals(answer, "N")) {
                break;
            } else  ;
        }
    }




    public int opponentScore() {
        return 15 + (int)(Math.random() * ((21 - 15) + 1));
    }




}
