import javax.swing.*;
import java.awt.*;

public class Board extends JComponent {

    int posX;
    int posY;
    int mapSize;


    public Board() {
        mapSize = 720;
        setPreferredSize(new Dimension(mapSize, mapSize));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        posX = 0;
        posY = 0;
        PositionedImage tile;
        PositionedImage wall;
        PositionedImage heropic;

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

        for (int i = 0; i < wallsArray.length; i++) {                       //draw the board with tiles and walls
            for (int j = 0; j < wallsArray.length; j++) {
                if (wallsArray[i][j] == 1) {
                    wall = new PositionedImage("assets/wall.png", j , i );
                    wall.draw(graphics);
                } else if (wallsArray[i][j] == 0) {
                    tile = new PositionedImage("assets/floor.png", j, i );
                    tile.draw(graphics);
                }
            }
        }
        heropic = new PositionedImage("assets/hero-down.png", 0 , 0 );
        heropic.draw(graphics);

    }

    /*public static void main(String[] args) {
        JFrame frame = new JFrame("Wanderer - The RPG Game");
        Board board = new Board();
        Hero hero = new Hero();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.addKeyListener(hero);
    }*/

}