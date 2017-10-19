package Twentyplusone;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Card {
    Color color;
    Suit suit;
    Rank rank;


    public Card(Color color, Suit suit, Rank rank) {
        this.color = color;
        this.suit = suit;
        this.rank = rank;
    }

    public enum Color {RED, BLACK;
        private static final List<Color> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static Color randomColor()  {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }

    public enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES;
        private static final List<Suit> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static Suit randomSuit()  {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }

    public enum Rank {TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
        private static final List<Rank> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static Rank randomRank()  {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }

}
