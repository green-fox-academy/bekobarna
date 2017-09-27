import java.util.ArrayList;

public class Sum {
    ArrayList<Integer> list;
    int sum;

    public int summing () {
        for (int i : list) {
            sum = sum + i;
        }
        return sum;
    }

}
