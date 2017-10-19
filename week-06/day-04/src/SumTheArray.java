public class SumTheArray {

    public static <T extends Number> void printArray(T[] inputArray, T length) {
        float sum = 0.f;
        try {
            for (int i = 0; i < inputArray.length; i++) {
                sum += inputArray[i].floatValue();
            }
            /*System.out.printf("%s ", sum);
            System.out.println("");*/
        } catch (IndexOutOfBoundsException e){
            System.out.println("ooops, your length is bigger than the size of the array");
        } finally {
            for (int i = 0; i < inputArray.length; i++) {
                sum += inputArray[i].floatValue();
            }
            System.out.printf("%s ", sum);
            System.out.println("");
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
        printArray(intArray, 5);

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray, 5);

        System.out.println("\nArray longArray contains:");
        printArray(longArray, 5);

        System.out.println("\nArray floatArray contains:");
        printArray(floatArray, 5);

        System.out.println("\nArray shortArray contains:");
        printArray(shortArray, 5);

        System.out.println("\nArray byteArray contains:");
        printArray(byteArray, 5);
    }
}
