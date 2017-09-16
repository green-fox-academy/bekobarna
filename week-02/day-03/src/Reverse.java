// Create a function that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.

public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        for (int i = reversed.length() - 1; i >= 0 ; i--) {
            char result = reversed.charAt(i);
            System.out.print(result);
        }
        /*StringBuilder quote = new StringBuilder(reversed);
        quote = quote.reverse();
        System.out.println(quote);*/
    }
}
