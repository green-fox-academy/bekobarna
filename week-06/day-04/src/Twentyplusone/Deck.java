package Twentyplusone;

import java.util.ArrayList;
import java.util.Collections;

public class Deck extends Card {
    static ArrayList<Card> deck;

    public Deck(Color color, Suit suit, Rank rank) {
        super(color, suit, rank);
    }

    public static void fillDeck() {
        deck = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            deck.add(i, new Card(Color.randomColor(), Suit.randomSuit(), Rank.randomRank()));
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card pullFirst() {
        Card drawn = deck.get(0);
        deck.remove(0);
        return drawn;
    }

    public Card pullLast() {
        Card drawn = deck.get(deck.size() - 1);
        deck.remove(deck.size() - 1);
        return drawn;
    }

    public Card pullRandom() {
        int random = (int) Math.random() * 10;
        Card drawn = deck.get(random);
        deck.remove(random);
        return drawn;
    }
}
