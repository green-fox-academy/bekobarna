// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.*;

public class WriteMultipleLines {
  public static void main(String[] args) {
    System.out.println("Please tell me the path of the file");
    Scanner scan = new Scanner(System.in);
    String path = scan.nextLine();
    System.out.println("Please tell me a word");
    String word = scan.nextLine();
    System.out.println("Please tell me a number");
    int number = scan.nextInt();

    System.out.println(fileWriter(path, word, number));
  }

  static File fileWriter (String path, String word, int lines) {
    List<String> content = new ArrayList<>();
    for (int i = 0; i < lines; i++) {
      content.add(word);
    }
    try {
      Path filePath = Paths.get(path);
      Files.write(filePath, content);
    } catch (Exception e) {
    }
    File file = new File(path);
    return file;
  }
}