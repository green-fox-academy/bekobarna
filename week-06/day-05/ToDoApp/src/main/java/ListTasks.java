import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ListTasks {
    public void taskPrint() {
        try {
            Path filePath = Paths.get("C:\\Users\\bekob\\greenfox\\bekobarna\\week-06\\day-05\\ToDoApp\\src\\assets\\tasks.txt");
            List<String> myList = Files.readAllLines(filePath);
            if (myList.size() == 0) {
                System.out.println("\nNo todos for today! :)");
            } else {
                System.out.println("");
                for (int i = 0; i < myList.size(); i++) {
                    System.out.println((i + 1) + " " + myList.get(i));
                }
            }
        } catch (Exception e) {
            System.out.println("\nCannot access or read tasks.txt");
        }
    }
}
