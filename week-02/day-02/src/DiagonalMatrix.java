// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        System.out.println("How big of a matrix do you want?");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int matrix [][] = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++){
                if (j == i){
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < size; i++) {
           for (int j = 0; j < size; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println(" 3");
        }
    }
}


/*import java.util.Arrays;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int[] first = {1, 0, 0, 0};
        int[] second = {0, 1, 0, 0};
        int[] third = {0, 0, 1, 0};
        int[] fourth = {0, 0, 0, 1};
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        System.out.println(Arrays.toString(third));
        System.out.println(Arrays.toString(fourth));
    }
}*/

