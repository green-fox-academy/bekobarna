package Twentyplusone;

public class Card {
    Color color;
    Suit suit;
    Rank rank;


    public Card() {
        this.color = Color.getRandomColor();
        this.suit = Suit.getRandomSuit();
        this.rank = Rank.getRandomRank();
    }

    public enum Color {
        RED, BLACK;
        public static Color getRandomColor() {
            return values()[(int) (Math.random() * values().length)];
        }
    }

    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES;
        public static Suit getRandomSuit() {
            return values()[(int) (Math.random() * values().length)];
        }
    }

    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
        public static Rank getRandomRank() {
            return values()[(int) (Math.random() * values().length)];
        }
    }

}
