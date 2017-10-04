import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

public class Board extends JComponent implements KeyListener {
    int mapSize;
    Hero hero;
    Map walls;

    public Board() {
        hero = new Hero();
        walls = new Map();
        this.mapSize = 720;
        setPreferredSize(new Dimension(mapSize, mapSize));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        int[][] wallsArray = walls.mapOfWalls();

        for (int i = 0; i < wallsArray.length; i++) {                                      //draw the board with tiles and walls
            for (int j = 0; j < wallsArray.length; j++) {
                if (walls.isItaAWall(i, j)) {
                    PositionedImage wall = new PositionedImage("assets/wall.png", j , i );
                    wall.draw(graphics);
                } else {
                    PositionedImage tile = new PositionedImage("assets/floor.png", j, i );
                    tile.draw(graphics);
                }
            }
        }
        PositionedImage heropic = new PositionedImage(hero.image, hero.posX , hero.posY );      //draw hero
        heropic.draw(graphics);
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
    }
    @Override
    public void keyReleased(KeyEvent e) {                                                       //movement with hero
        if (e.getKeyCode() == KeyEvent.VK_UP ) {
            if (hero.posY > 0 && !walls.isItaAWall(hero.posY - 1, hero.posX)) {
                hero.goUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
            if (hero.posY < 9 && !walls.isItaAWall(hero.posY + 1, hero.posX)) {
                hero.goDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
            if (hero.posX < 9 && !walls.isItaAWall(hero.posY, hero.posX + 1)) {
                hero.goRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
            if (hero.posX > 0 && !walls.isItaAWall(hero.posY, hero.posX - 1)) {
                hero.goLeft();
            }
        }
        repaint();
    }
}