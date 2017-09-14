// Add "a" to every string in the far list.

import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        ArrayList<String> far = new ArrayList<String>(
            BanasArrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
        String a = "a";
        for (int i = 0; i < far.size(); i++) {
           String name = far.get(i) + "a";
           far.set(i, name);
        }
        System.out.println(far);
    }
}
