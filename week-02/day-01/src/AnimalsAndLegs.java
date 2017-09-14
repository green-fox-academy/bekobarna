// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The seconf represents the number of pigs the farmer has
// It should print how many legs all the animals have

import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
      System.out.println("Please write the number of chickens you have here: ");
      Scanner scan = new Scanner (System.in);
      int chickens = scan.nextInt();
      System.out.println("Please write the number of pigs you have here: ");
      Scanner scan2 = new Scanner (System.in);
      int pigs = scan2.nextInt();
      int chickenLegs = chickens * 2;
      int pigLegs = pigs * 4;
      System.out.println("Your animals have this many legs: " + (chickenLegs + pigLegs));
  }
}
