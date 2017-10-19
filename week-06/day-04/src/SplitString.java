import java.util.Arrays;

public class SplitString {

    public static void main(String[] args) {
        int splitNumber = 4;
        String inputString = "lovebarbara";

        try {
            System.out.println(Arrays.toString(stringSplitter(inputString, splitNumber)));
        } catch(IndexOutOfBoundsException ex) {
            System.out.println("Your number is bigger than the lenght of your word");
        }
    }

    public static String[] stringSplitter (String input, int number) {
        String[] array = new String[2];
        array[0] = input.substring(0, number);
        array[1] = input.substring(number, input.length());
        return array;
    }
}
