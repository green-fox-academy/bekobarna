// Write a program that asks for two numbers
// Thw first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is exellent!
// If the the number of girls and boys are equal and there are more people coming than 20
//
// It should print: Quite cool party!
// It there are more than 20 people coming but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        System.out.println("Number of girls: ");
        Scanner scan1 = new Scanner(System.in);
        int girls = scan1.nextInt();
        System.out.println("Number of boys: ");
        Scanner scan2 = new Scanner(System.in);
        int boys = scan2.nextInt();
        if ((girls == boys) && ((girls + boys) > 20 )) {
            System.out.println("The party is excellent!");
        } else if ((girls == boys) || ((girls / boys) != 1)) {
            System.out.println("Quite cool party!");
        } else if ((girls + boys) > 20) {
            System.out.println("Average party...");
        } else if (girls == 0) {
            System.out.println("Sausage party");
        }
    }
}