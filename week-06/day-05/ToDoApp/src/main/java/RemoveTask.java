import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RemoveTask {
    public void taskRemove(String[] newTask, int index) {
        StringBuilder inputToList = new StringBuilder();
        for (int i = 1; i < newTask.length; i++) {
            inputToList.append(newTask[i] + " ");
        }
        String resultString = inputToList.toString();

        if (!resultString.isEmpty()) {
            try {
                Path filePath = Paths.get("C:\\Users\\bekob\\greenfox\\bekobarna\\week-06\\day-05\\ToDoApp\\src\\assets\\tasks.txt");
                List<String> myListOriginal = Files.readAllLines(filePath);
                myListOriginal.remove(index);
                Files.write(filePath, myListOriginal);
                System.out.println("The task was removed :)");
            } catch (Exception e) {
                System.out.println("\nCannot access or read tasks.txt");
            }
        } else {
            System.out.println("\nUnable to remove: no index provided");
        }
    }

}
