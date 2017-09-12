// Create a program that writes this line 100 times:
// "I won't cheat on the exam!"

public class IWontCheatOnTheExams {
    public static void main(String[] args) {
        String  line = "I won`t cheat on the exam!";
        for (int i = 0; i < 100; i++) {
            System.out.println(line);
        }
    }
}
