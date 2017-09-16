//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        System.out.println("Please write a number here: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println("");
        System.out.println("The factorial of your number is: " + factorio(number));
    }

    public static int factorio(int num) {
        if (num == 0) {
            return 1;
        }
        int numFact = 1;
        for (int i = 1; i <= num; i++) {
           numFact *= i;
        }
        return numFact;
    }
}
