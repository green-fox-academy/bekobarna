import java.util.ArrayList;

public class Sum {
    ArrayList<Integer> list;
    int sum;

    public int summing() {
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

}
