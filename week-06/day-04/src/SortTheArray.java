import java.util.Arrays;

public class SortTheArray {

        public static <T extends Number> void printArray(T[] inputArray) {
            try {
                Arrays.sort(inputArray);
            } catch (Exception e){
                System.out.println("oops, something went wrong");
            } finally {
                Arrays.sort(inputArray);
                for (T element : inputArray) {
                    System.out.printf("%s ", element);
                }
                System.out.println();
            }
        }


    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 1, 4, 2, 2 };
        Double[] doubleArray = { 1.54, 2.55, 2.505, 4.56 };
        Long[] longArray = { 999L, 2345L, 3L, 12897L, 151515L };
        Float[] floatArray = { 5.4f, 2.9f, 2.8f, 0.1f, 5.0f };
        Short[] shortArray = { 2, 8, 3, 0, 6};
        Byte[] byteArray = {2, 7, 4, 10, 1};

        System.out.println("Array integerArray contains:");
        printArray(intArray);

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);

        System.out.println("\nArray longArray contains:");
        printArray(longArray);

        System.out.println("\nArray floatArray contains:");
        printArray(floatArray);

        System.out.println("\nArray shortArray contains:");
        printArray(shortArray);

        System.out.println("\nArray byteArray contains:");
        printArray(byteArray);
    }
}
