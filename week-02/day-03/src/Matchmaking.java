// Join the two lists by matching one girl with one boy in the order list
// Exepected output: "Eve", "Joe", "Ashley", "Fred"...

import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(
            Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(
            Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        ArrayList<String> order = new ArrayList<String>();

        for (int i = 0; i < girls.size(); i++) {
            order.add(order.size(), girls.get(i));
            order.add(order.size(), boys.get(i));
        }
        order.add(order.size(), boys.get(5));
        System.out.println(order);
    }
}