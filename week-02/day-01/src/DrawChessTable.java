// Crate a program that draws a chess table like this
//
// % % % % 
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % % 
//  % % % %
//

import java.util.Scanner;
public class DrawChessTable {
    public static void main(String[] args) {
        System.out.println("Please write a number here: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print("% ");
            }
            System.out.println("");
        }
    }
}