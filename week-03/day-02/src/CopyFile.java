// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please tell me the name of the first file");
    String inputFile = scan.nextLine();
    System.out.println("");
    System.out.println("Where do you want to copy it?");
    String secondFile = scan.nextLine();

    try {Path filePath = Paths.get(inputFile);
      List<String> lines = Files.readAllLines(filePath);

      Path filePath2 = Paths.get(secondFile);
      Files.write(filePath2, lines);
      System.out.println();
    } catch (Exception e) {
    }


    }
}