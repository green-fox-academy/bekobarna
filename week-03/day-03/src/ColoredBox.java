import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

    public static void mainDraw(Graphics graphics){
      // draw a box that has different colored lines on each edge.

        graphics.setColor(Color.RED);
        graphics.drawLine(0, 0, 100, 0);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(100, 0, 100, 100);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(100, 100, 0, 100);
        graphics.setColor(Color.YELLOW);
        graphics.drawLine(0, 100, 0, 0);


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
