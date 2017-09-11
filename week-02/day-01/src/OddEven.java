import java.util.Scanner;

// Write a program that reads a number form the standard input,
// Than prints "Odd" if the number is odd, or "Even" it it is even.
public class OddEven {
    public static void main(String[] args) {
        System.out.println("Please write a number here: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (((number % 2) == 0)) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}