import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {

    public static void mainDraw(Graphics graphics){
      // reproduce this:
      // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]

        for (int i = 0; i < 19; i++) {
            Color color = new Color(176, 78, 240);
            graphics.setColor(color);
            graphics.fillRect((10 + (10 * i)) ,(10 + (10 * i)) , 10, 10);
            color = new Color(0, 0, 0);
            graphics.setColor(color);
            graphics.drawRect((10 + (10 * i)) ,(10 + (10 * i)) , 10, 10);

        }

    }

//    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
