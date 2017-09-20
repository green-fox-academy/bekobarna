import java.util.Scanner;
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics){
      // create a square drawing function that takes 2 parameters:
      // the square size, and the fill color,
      // and draws a square of that size and color to the center of the canvas.
      // create a loop that fills the canvas with rainbow colored squares.



        for (int i = 0; i < (int) (Math.random( ) * 100000); i++) {
            rainbowSquareDraw(graphics);
        }

    }

    public static void rainbowSquareDraw(Graphics graphics){

        int size = (int) (Math.random( )*100);
        int red = (int) (Math.random( )*256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        Color randomColor = new Color(red, green, blue);

        graphics.setColor(randomColor);
        graphics.fillRect(((WIDTH/2) - (size/2)), ((HEIGHT/2) - (size/2)), size, size);
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
