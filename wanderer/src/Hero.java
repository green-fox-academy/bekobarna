import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;

public class Hero extends Character implements KeyListener {



        public Hero() {
            super(0, 0, "hero");
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
                posY -= 72;
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                posY += 72;
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                posX += 72;
            } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                posX -= 72;
            }
        }
}

