import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import java.awt.event.KeyListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Wanderer - The RPG Game");
        Board board = new Board();
        Hero hero = new Hero();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.addKeyListener(hero);
    }
}
