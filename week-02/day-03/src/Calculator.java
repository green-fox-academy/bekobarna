// Create a simple calculator application which reads the parameters from the prompt
// and prints the result to the prompt.
// It should support the following operations:
// +, -, *, /, % and it should support two operands.
// The format of the expressions must be: {operation} {operand} {operand}.
// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

// You can use the Scanner class
// It should work like this:

// Start the program
// It prints: "Please type in the expression:"
// Waits for the user input
// Print the result to the prompt
// Exit

import java.util.*;

public class Calculator {
  public static void main(String... args) {
    System.out.println("Please type in the expression:");
    Scanner scan = new Scanner(System.in);
    String operation = scan.nextLine();
    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();

    if (operation.equals("+")) {
      System.out.println(addition(num1, num2));
    } else if (operation.equals("-")) {
      System.out.println(subtraction(num1, num2));
    } else if (operation.equals("*")) {
      System.out.println(multiplication(num1, num2));
    } else if (operation.equals("/")) {
      System.out.println(division(num1, num2));
    } else if (operation.equals("%")) {
      System.out.println(remainder(num1, num2));
    }
  }

  public static double addition (double num1, double num2) {
    return (num1 + num2);
  }

  public static double subtraction (double num1, double num2) {
    return (num1 - num2);
  }

  public static double multiplication (double num1, double num2) {
    return (num1 * num2);
  }

  public static double division (double num1, double num2) {
    return (num1 / num2);
  }

  public static double remainder (double num1, double num2) {
    return (num1 % num2);
  }

}