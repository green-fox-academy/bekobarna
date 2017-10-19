package Parkinglot;

public class Car {
    Type type;
    Color color;


    public enum Type {
        Lada, Trabant, Wartburg;
        public static Type getRandomType() {
            return values()[(int) (Math.random() * values().length)];
        }
    }

    public enum Color {
        White, Red, Black;
        public static Color getRandomColor() {
            return values()[(int) (Math.random() * values().length)];
        }
    }

    public Car() {
        this.type = Type.getRandomType();
        this.color = Color.getRandomColor();
    }


}
