import java.util.Arrays;

public class Domino implements Comparable<Domino>, Printable {

    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    @Override
    public int compareTo(Domino other) {
        return Integer.compare(this.values[0], other.values[0]);
    }

    @Override
    public void printAllFields() {
        System.out.println(Arrays.toString(values));
    }
}