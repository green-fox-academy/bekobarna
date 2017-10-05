import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class Board extends JComponent implements KeyListener {
    int mapSize;
    Hero hero;
    Map walls;
    Boss boss;
    Hud hud;
    ArrayList<Skeleton> skeletons;

    public Board() {
        this.mapSize = 720;
        setPreferredSize(new Dimension(mapSize, 880));
        setVisible(true);
        hero = new Hero();
        walls = new Map();
        boss = new Boss();
        hud = new Hud();
        skeletons = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Skeleton sk = new Skeleton();
            skeletons.add(sk);
        }
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

        for (int i = 0; i < skeletons.size(); i++) {                                                    //draw skeletons
            PositionedImage skeletonpic = new PositionedImage(skeletons.get(i).image, 9  , 2 + (2 * i) );
            skeletonpic.draw(graphics);
        }

        graphics.setColor(Color.WHITE);                                                             // draw HUD
        graphics.fillRect(100, 725, 400, 60);
        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Sans_Serif", Font.PLAIN, 18));
        graphics.drawString(hud.heroStats(), 110, 760);

        /**/
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
    }
    @Override
    public void keyReleased(KeyEvent e) {                                                       //movement with hero
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (hero.posY > 0 && !walls.isItaAWall(hero.posY - 1, hero.posX)) {
                hero.goUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (hero.posY < 9 && !walls.isItaAWall(hero.posY + 1, hero.posX)) {
                hero.goDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (hero.posX < 9 && !walls.isItaAWall(hero.posY, hero.posX + 1)) {
                hero.goRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (hero.posX > 0 && !walls.isItaAWall(hero.posY, hero.posX - 1)) {
                hero.goLeft();
            }
        } /*else if (e.getKeyCode() == KeyEvent.VK_SPACE){
            hero.strike(boss);
            }*/
        repaint();
    }
}