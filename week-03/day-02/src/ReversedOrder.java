// Create a method that decrypts reversed-order.txt

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("reversed-order.txt");
            List<String> lines = Files.readAllLines(filePath);

            ArrayList<String> array = new ArrayList(Arrays.asList(lines));



        } catch (Exception e) {
            System.out.println("error");
        }

        
    }
}
