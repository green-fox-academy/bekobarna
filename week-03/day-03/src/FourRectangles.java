import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
      // draw four different size and color rectangles.
        int xPoints1[] = {0, 20, 20, 0};
        int yPoints1[] = {0, 0, 30, 30};
        graphics.setColor(Color.GREEN);
        graphics.fillRect(0, 0, 10, 20);
        graphics.setColor(Color.RED);
        graphics.fillRect(200, 200, 50, 87);
        graphics.setColor(Color.BLUE);
        graphics.fillRect(36, 47, 100, 167);
        graphics.setColor(Color.ORANGE);
        graphics.fillRect(WIDTH-123, HEIGHT-45, 123, 45);

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
