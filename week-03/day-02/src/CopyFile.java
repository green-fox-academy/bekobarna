// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String whatToCopy = scan.nextLine();
    String whereToCopy = scan.nextLine();

  }

  static boolean fileCopy (String fileWhat, String fileWhere) {
    try {Path filePath = Paths.get("file1.txt");
      List<String> lines = Files.readAllLines(filePath);
      Path filePath2 = Paths.get(fileWhere);
      Files.write(filePath, Files, lines);


    } catch (Exception e) {
    }

    try {
      Path filePath = Paths.get(fileWhere);
      Files.write(filePath, Files, lines);
    } catch (Exception e) {
    }
    File file = new File(fileWhere);

    return ;
  }
}