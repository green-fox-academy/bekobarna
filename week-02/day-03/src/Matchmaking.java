// Join the two lists by matching one girl with one boy in the order list
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...
import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(
            BanasArrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(
            BanasArrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        ArrayList<String> order = new ArrayList<String>();

        for (int i = 0; i < girls.size(); i++) {
            order.add(i, girls.get(i));
            order.add(i, boys.get(i));
        }
        order.add(10, boys.get(5));
        System.out.println(order);
    }
}