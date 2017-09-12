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
        System.out.println(printer(printer("")));

    }

    public static String printer (String input) {
        Scanner scan = new Scanner(System.in);
        String  line = scan.nextLine();
        return input;
    }

}
