// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;
public class ParametricAverage {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner scan = new Scanner(System.in);
        double numTimes = scan.nextInt();
        for (int i = 0; i < numTimes-1; i++) {
            System.out.println("Please enter a number: ");
            Scanner scan2 = new Scanner(System.in);
            double numEntered = scan2.nextInt();
            double sum = numTimes + numEntered;
            double average = (sum / numTimes);
            System.out.println("Sum; " + sum + " " + "Average: " + average);
        }
    }
}
