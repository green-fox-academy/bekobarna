import java.util.Scanner;

public class GuessMyNumber {
  public static void main(String[] args) {
    System.out.println("Welcome, we will play a little guessing game!");
    System.out.println("Please tell me the starting number: ");
    Scanner scan = new Scanner(System.in);
    int numStart = scan.nextInt();

    System.out.println("Please tell me the ending number");
    int numEnd = scan.nextInt();

    System.out.println("");
    System.out.println("Awesome, let`s start!");

    int numberStored = getRandomNumber(numStart, numEnd);

    while (true) {
      System.out.println("");
      System.out.println("Please enter a number between " + numStart + " and " + numEnd + ":");
      int guess = scan.nextInt();
      if (guess == numberStored) {
        System.out.println("Congratulations, you found the number: " + numberStored);
        break;
      }
      else if (guess > numberStored) {
        System.out.println("The stored number is lower");
      } else  System.out.println("The stored number is higher");
    }
  }

  static int getRandomNumber(int start, int end) {
    return (int) (Math.random() * (end - start) + start);
  }
}