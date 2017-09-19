// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {

    }
  }

  public static String numberOfLines (String fileName){
    Path filePath = Paths.get("my-file.txt");
    try {
      List<String> myList = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println(0);
    }
    return ;

  }


}