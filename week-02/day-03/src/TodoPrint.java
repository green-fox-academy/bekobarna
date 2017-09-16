// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected outpt:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        String todoBeginning = "My todo:\n";
        String todoGames = " - Download games\n";
        String todoDiablo = "    - Diablo";

        StringBuilder todo = new StringBuilder(todoText);
        todo.insert(0, todoBeginning);
        todo.insert(21, todoGames);
        todo.insert(39, todoDiablo);
        System.out.println(todo);
    }
}
