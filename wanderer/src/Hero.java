import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Hero extends Character {

    public Hero() {
        super();
        this.posX = 0;
        this.posY = 0;
        this.width = 72;
        this.image = "assets/hero-down.png";
    }



   /* @Override
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
            hero.image = "assets/hero-right.png";
            hero.posX --;
        }
        repaint();
    }

    }*/

}

