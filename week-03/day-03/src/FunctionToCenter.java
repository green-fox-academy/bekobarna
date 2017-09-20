import java.util.Scanner;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {

    public static void mainDraw(Graphics graphics){
      // create a line drawing function that takes 2 parameters:
      // the x and y coordinates of the line's starting point
      // and draws a line from that point to the center of the canvas.
      // fill the canvas with lines from the edges, every 20 px, to the center.
        lineDraw(graphics);
    }

    public static void lineDraw(Graphics graphics){
        int startX = 0;
        int startY = 0;

        for (int i = 0; i < 20; i++) {
            int red = (int) (Math.random( ) * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);
            graphics.setColor(new Color(red, green, blue));
            graphics.drawLine(startX, startY , WIDTH/2, HEIGHT/2);
            startY = startY + 20;
        }

        for (int i = 0; i < 20; i++) {
            int red = (int) (Math.random( ) * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);
            graphics.setColor(new Color(red, green, blue));
            graphics.drawLine(startX, startY , WIDTH/2, HEIGHT/2);
            startX = startX + 20;
        }

        int startX2 = WIDTH;
        int startY2 = HEIGHT;
        for (int i = 0; i < 20; i++) {
            int red = (int) (Math.random( ) * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);
            graphics.setColor(new Color(red, green, blue));
            graphics.drawLine(startX2, startY2 , WIDTH/2, HEIGHT/2);
            startY2 = startY2 - 20;
        }

        for (int i = 0; i < 20; i++) {
            int red = (int) (Math.random( ) * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);
            graphics.setColor(new Color(red, green, blue));
            graphics.drawLine(startX2, startY2 , WIDTH/2, HEIGHT/2);
            startX2 = startX2 - 20;
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
