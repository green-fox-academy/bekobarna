import java.lang.reflect.Array;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int posX;
    int posY;

    public Board() {

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        posX = 0;
        posY = 0;
        PositionedImage tile;
        PositionedImage wall;
        int[][] wallsArray = {
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},     //1st row
            {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},     //2nd row
            {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},     //3rd row
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},     //4th row
            {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},     //5th row
            {0, 1, 0, 1, 0, 0, 0, 0, 1, 0},     //6th row
            {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},     //7th row
            {0, 0, 0, 0, 0, 1, 1, 0, 1, 0},     //8th row
            {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},     //9th row
            {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},     //10th row
        };

        for (int j = 0; j < wallsArray.length; j++) {
            for (int i = 0; i < wallsArray.length; i++) {
                if (wallsArray[j][i] == 1) {
                    wall = new PositionedImage("assets/wall.png", i * 72, j * 72);
                    wall.draw(graphics);
                } else if (wallsArray[j][i] == 0) {
                    tile = new PositionedImage("assets/floor.png", i * 72, j * 72);
                    tile.draw(graphics);
                }
            }
        }

    }

        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.


    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        // Here is how you can add a key event listener
        // The board object will be notified when hitting any key
        // with the system calling one of the below 3 methods
        frame.addKeyListener(board);
        // Notice (at the top) that we can only do this
        // because this Board class (the type of the board object) is also a KeyListener
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            posY -= 72;
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            posY += 72;
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            posX += 72;
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            posY -= 72;
        }

        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}