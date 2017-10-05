import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Hero extends Character {


    public Hero() {
        this.posX = 0;
        this.posY = 0;
        this.image = "assets/hero-down.png";
        this.level = 1;
        this.maxHp = 20 + (3 * d6());
        this.dp = 2 * d6();
        this.sp = 5 + d6();
        this.hp = this.maxHp;
        this.dead = false;
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
