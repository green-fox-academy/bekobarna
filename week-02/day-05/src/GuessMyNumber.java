import java.util.Scanner;
public class GuessMyNumber {
  public static void main(String[] args) {
    System.out.println("Welcome, we will play a little guessing game");
    System.out.println("Please tell me the starting number: ");
    Scanner scan = new Scanner(System.in);
    int numStart = scan.nextInt();
    System.out.println("Please tell me the ending number");
    Scanner scan2 = new Scanner(System.in);
    int numEnd = scan2.nextInt();
    System.out.println("");
    System.out.println("Awesome, let`s start!");

    int numberStored = getRandomNumber(numStart, numEnd);
    while (true) {
      System.out.println("Please enter a number between " + numStart + " and " + numEnd + ":");
      Scanner scan3 = new Scanner(System.in);
      int guess = scan3.nextInt();
      if (guess == numberStored) {
        System.out.println("Congratulations, you found the number: " + numberStored);
        break;
      }
      else if (guess > numberStored) System.out.println("The stored number is lower");
      else  System.out.println("The stored number is higher");
    }
  }

  static int getRandomNumber(int from, int to) {
    return (int) (Math.random() * (to - from) + from);
  }
}