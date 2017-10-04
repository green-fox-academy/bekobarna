import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Hero extends Character implements KeyListener {

    public Hero() {
        super(0, 0, 72, "hero");
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            startPosY -= width;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            startPosY += width;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            startPosX += width;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            startPosX -= width;
        }
    }

}

