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
    numberOfLines("my-file.txt");
    }

  public static String numberOfLines (String fileName){
    Path filePath = Paths.get("my-file.txt");
    int count = 0;
    try {
      List<String> myList = Files.readAllLines(filePath);
      for (int i = 0; i < myList.size(); i++) {
        count += i;
      }
    } catch (IOException e) {
      System.out.println(0);
    }
    return fileName;

  }
}