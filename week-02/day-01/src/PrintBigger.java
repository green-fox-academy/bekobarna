// Write a program that asks for two numbers and prints the bigger one
import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        System.out.println("Please write two numbers here: ");
        Scanner scan1 = new Scanner(System.in);
        int num1 = scan1.nextInt();
        Scanner scan2 = new Scanner(System.in);
        int num2 = scan2.nextInt();
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
