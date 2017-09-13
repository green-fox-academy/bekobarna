// Create a function that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.

public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        char result = reversed.charAt(10);
        System.out.println(result);


       /* for (int i = reversed.length(), i >= 0, i--) {
            char result = reversed.charAt(i);
            System.out.println(result);*//*
        }*/
    }
}


/*       for (String part : reversed.split(" ")) {
               System.out.print(new StringBuilder(part).reverse().toString());
               System.out.print(" ");
               }*/

