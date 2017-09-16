//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...

import java.util.Scanner;

public class Printer {
    public static void main(String[] args) {
        System.out.println("Please write a word here: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        String[] words = {"one", "two", "three", "four", "..."};
        System.out.println(printer(words));

    }

    static String printer (String [] input) {
        String wordsAll = "";
        for (int i = 0; i < input.length; i++) {
            wordsAll += input[i] + "\n";
        }
        return wordsAll;
    }
}