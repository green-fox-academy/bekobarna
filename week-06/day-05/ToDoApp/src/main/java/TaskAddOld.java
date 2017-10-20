import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TaskAddOld {

    public void TaskAdd(String newTask) {
        try {
            Path filePath = Paths.get("C:\\Users\\bekob\\greenfox\\bekobarna-todo-app/tasks.txt");
            List<String> myListOriginal = Files.readAllLines(filePath);
            myListOriginal.add(newTask);
            Files.write(filePath, myListOriginal);
        } catch (Exception e) {
            System.out.println("error");
        }

    }
}
