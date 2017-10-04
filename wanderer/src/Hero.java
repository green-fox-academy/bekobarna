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



   /* public void goUp (KeyEvent e) {
        PositionedImage hero = new PositionedImage("assets/hero-up.png", posX , posY );
        posY -= 72;
    }

    public void goDown (KeyEvent e) {
        PositionedImage hero = new PositionedImage("assets/hero-down.png", posX , posY );
        posY += 72;
    }

    public void goLeft (KeyEvent e) {
        PositionedImage hero = new PositionedImage("assets/hero-right.png", posX , posY );
        posX -= 72;
    }

    public void goRight (KeyEvent e) {
        PositionedImage hero = new PositionedImage("assets/hero-left.png", posX , posY );
        posX += 72;
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
            goUp(e);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
            goDown(e);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
            goRight(e);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
            goLeft(e);
        }

    }*/

}

