// Create a method that decrypts the duplicated-chars.txt

import java.io.File;
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

            for(int i = 0; i < duplicateLines.size();i += 2)
                System.out.println(duplicateLines.get(i));

        } catch (Exception e) {
            System.out.println("Uh-oh, could not read the file!");
        }



    }
}
