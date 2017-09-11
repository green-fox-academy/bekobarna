import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it
      System.out.println("Please write here a distance in km: ");
      Scanner scan = new Scanner (System.in);
      int km = scan.nextInt();
      double mile = (km * 0.62);
      System.out.println(mile + " miles");
      }
    }