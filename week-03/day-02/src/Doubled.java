// Create a method that decrypts the duplicated-chars.txt

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.*;

public class Doubled {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("duplicated-chars.txt");
            List<String> lines = Files.readAllLines(filePath);

            for (int i = 0; i < lines.size(); i++) {
                lines.get(i);
                for (int j = 0; j < (lines.get(i)).length(); j++) {
                    lines.get(j);
                    System.out.println(lines.get(j));
                }
                System.out.println("");
            }


        } catch (Exception e) {
            System.out.println("error");
        }

    }
}
