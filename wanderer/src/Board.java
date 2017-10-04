import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

public class Board extends JComponent implements KeyListener {
    int mapSize;
    Hero hero;
    Map walls;
    Boss boss;
    Skeleton skeleton1;
    Skeleton skeleton2;
    Skeleton skeleton3;
    Hud hud;

    public Board() {
        hero = new Hero();
        walls = new Map();
        boss = new Boss();
        skeleton1 = new Skeleton();
        skeleton2 = new Skeleton();
        skeleton3 = new Skeleton();
        hud = new Hud();



        this.mapSize = 720;
        setPreferredSize(new Dimension(mapSize, 880));
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
        PositionedImage heropic = new PositionedImage(hero.image, hero.posX , hero.posY );             //draw hero
        heropic.draw(graphics);
        PositionedImage bosspic = new PositionedImage(boss.image, 9 , 0 );                  //draw boss
        bosspic.draw(graphics);
        PositionedImage skeleton1pic = new PositionedImage(skeleton1.image, 9 , 2 );      //draw skeleton1
        skeleton1pic.draw(graphics);
        PositionedImage skeleton2pic = new PositionedImage(skeleton2.image, 9 , 5 );      //draw skeleton2
        skeleton2pic.draw(graphics);
        PositionedImage skeleton3pic = new PositionedImage(skeleton3.image, 4 , 5 );      //draw skeleton3
        skeleton3pic.draw(graphics);

        graphics.setColor(Color.WHITE);
        graphics.fillRect(100, 725, 400, 60);
        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Sans_Serif", Font.PLAIN, 18));
        graphics.drawString(hud.heroStats(), 110, 760);





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