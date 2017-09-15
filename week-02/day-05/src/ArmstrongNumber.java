import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
    System.out.println("Please write a number here:");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();

    System.out.println("");
    System.out.println("The " + armstrongCalculator(number) +  " is an Armstrong number");



  }

  static int armstrongCalculator (int num) {
    int length = (int)(Math.log10(num) + 1);





    return num;
  }

}


  /*public static void main(String[] args) {
    Integer[] digits = getDigits(12345);
    System.out.println(Arrays.toString(digits));
  }

  public static Integer[] getDigits(int num) {
    List<Integer> digits = new ArrayList<Integer>();
    collectDigits(num, digits);
    return digits.toArray(new Integer[]{});
  }

  private static void collectDigits(int num, List<Integer> digits) {
    if(num / 10 > 0) {
      collectDigits(num / 10, digits);
    }
    digits.add(num % 10);
  }*/