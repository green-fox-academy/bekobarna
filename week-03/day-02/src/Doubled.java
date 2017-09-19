// Create a method that decrypts the duplicated-chars.txt

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.*;

public class Doubled {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("duplicated-chars.txt");
            List<String> duplicateLines = Files.readAllLines(filePath);

            String[] array = duplicateLines.toArray(new String[duplicateLines.size()]);

            String stringFull = array.toString();
            StringBuilder sb = new StringBuilder(stringFull);

            for (int i = 0; i < sb.length(); i += 2) {
                sb.deleteCharAt(i);
            }

           
        } catch (Exception e) {
            System.out.println("error");
        }

    }
}
