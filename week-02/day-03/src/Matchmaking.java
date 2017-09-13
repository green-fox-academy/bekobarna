// Join the two lists by matching one girl with one boy in the order list
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...
import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        ArrayList<String> order = new ArrayList<String>();

        for (int i = 0; i < girls.size(); i++) {
            String girlsName = girls.get(i);
            order.add(i, girlsName);
            String boysName = boys.get(i);
            order.add(i+1, boysName);
        }

        String Jeff = boys.get(5);
        order.add(10, Jeff);

        System.out.println(order);
    }
}