public class Hero extends Character {

    public Hero() {
        super();
        this.posX = 0;
        this.posY = 0;
        this.image = "assets/hero-down.png";
    }

    public void goUp () {
        this.image = "assets/hero-up.png";
        this.posY --;
    }
    public void goDown () {
        this.image = "assets/hero-down.png";
        this.posY ++;
    }
    public void goLeft () {
        this.image = "assets/hero-left.png";
        this.posX --;
    }
    public void goRight () {
        this.image = "assets/hero-right.png";
        this.posX ++;
    }
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
            hero.goUp();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
            hero.goDown();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT ) {
            hero.goRight();
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
            hero.goLeft();
        }
        repaint();
        */



