import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {
        return (a + b);
    }

    int maxOfThree(int a, int b, int c) {
        if (a > b && b > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }

    int median(List<Integer> pool) {
        Collections.sort(pool);
        int mid = pool.size() / 2;
        double result = ((double) pool.get(mid - 1) + (double) pool.get(mid)) / 2;
        if (pool.size() % 2 != 0) {
            return pool.get(mid);
        } else {
            return (int) result;
        }
    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }

    String translate(String hungarian) {
        StringBuilder sb = new StringBuilder();
        sb.append(hungarian);
        int length = sb.length();

        for (int i = 0; i < length / 2; i = i++) {
            if (sb.charAt(i + 1) == sb.charAt(i + 3)) {
                sb.delete(i + 2, i + 3);
                i++;
            }
        }
        return sb.toString();

    }
        /*String teve = hungarian;
        int length = teve.length();
            char c = teve.charAt(i);
            if (isVowel(c)) {
                teve = String.join(c + "v" + c, teve.split("" + c));
                i++;
                length += 2;
            }

        return teve;*/

}