import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Hero extends Character {

  //  Map map;

    public Hero() {
        super();
        this.posX = 0;
        this.posY = 0;
        this.image = "assets/hero-down.png";
        this.level = 1;
        this.maxHp = 20 + (3 * d6());
        this.dp = 2 * d6();
        this.sp = 5 + d6();
        this.hp = this.maxHp;
        //      map = new Map();
    }

    public void goUp() {
        this.image = "assets/hero-up.png";
        this.posY--;
    }

    public void goDown() {
        this.image = "assets/hero-down.png";
        this.posY++;
    }

    public void goLeft() {
        this.image = "assets/hero-left.png";
        this.posX--;
    }

    public void goRight() {
        this.image = "assets/hero-right.png";
        this.posX++;
    }

}

   /* public void keyTyped(KeyEvent e) {
    }
    public void keyPressed(KeyEvent e) {
    }
    public void keyReleased(
        KeyEvent e) {                                                       //movement with hero
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (this.posY > 0 && !map.isItaAWall(this.posY - 1, this.posX)) {
                this.goUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (this.posY < 9 && !map.isItaAWall(this.posY + 1, this.posX)) {
                this.goDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (this.posX < 9 && !map.isItaAWall(this.posY, this.posX + 1)) {
                this.goRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (this.posX > 0 && !map.isItaAWall(this.posY, this.posX - 1)) {
                this.goLeft();
            }
        }
        //repaint();
    }*/
