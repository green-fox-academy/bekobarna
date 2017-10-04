import javax.swing.JFrame;

public class Wanderer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Wanderer - The RPG Game");
        Board board = new Board();
        Hero hero = new Hero();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  frame.setDefaultCloseOperation(hero.dead == true);
        frame.setVisible(true);
        frame.pack();
        frame.setFocusable(true);
        frame.addKeyListener(board);
    }
}
