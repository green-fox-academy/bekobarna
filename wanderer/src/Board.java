import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

public class Board extends JComponent implements KeyListener {
    int mapSize;
    Hero hero;

    public Board() {
        hero = new Hero();
        mapSize = 720;
        setPreferredSize(new Dimension(mapSize, mapSize));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

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
                    PositionedImage wall = new PositionedImage("assets/wall.png", j , i );
                    wall.draw(graphics);
                } else if (wallsArray[i][j] == 0) {
                    PositionedImage tile = new PositionedImage("assets/floor.png", j, i );
                    tile.draw(graphics);
                }
            }
        }

        PositionedImage heropic = new PositionedImage(hero.image, hero.posX , hero.posY );
        heropic.draw(graphics);

    }


    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP ) {
            hero.image = "assets/hero-up.png";
            hero.posY --;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
            hero.image = "assets/hero-down.png";
            hero.posY ++;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
            hero.image = "assets/hero-right.png";
            hero.posX ++;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
            hero.image = "assets/hero-left.png";
            hero.posX --;
        }
        repaint();
    }

}