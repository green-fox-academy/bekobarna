// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

public class DiagonalMatrix {
    public static void main(String[] args) {
        int[] af = {4, 5, 6, 7};
        for (int i = 0; i < af.length; i++) {
            System.out.println(af[i] + " ");

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

