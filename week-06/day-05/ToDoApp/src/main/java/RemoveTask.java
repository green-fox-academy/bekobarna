import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RemoveTask {
    public void taskRemove(String[] args) {
        StringBuilder inputToList = new StringBuilder();
        for (int i = 1; i < args.length; i++) {
            inputToList.append(args[i] + " ");
        }
        String resultString = inputToList.toString();

        if (!resultString.isEmpty()) {
            try {
                Path filePath = Paths.get("C:\\Users\\bekob\\greenfox\\bekobarna\\week-06\\day-05\\ToDoApp\\src\\assets\\tasks.txt");
                List<String> myListOriginal = Files.readAllLines(filePath);
                int taskLineNumber = Integer.parseInt(args[1]);
                myListOriginal.remove(taskLineNumber);
                Files.write(filePath, myListOriginal);
                System.out.println("\nThe task was removed :)");
            } catch (NumberFormatException e) {
                System.out.println("\nUnable to remove: index is not a number");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("\nUnable to remove: index is out of bound");
            } catch (IOException e) {
                System.out.println("\nCannot access or read tasks.txt");
            }
        } else {
            System.out.println("\nUnable to remove: no index provided");
        }
    }

}
