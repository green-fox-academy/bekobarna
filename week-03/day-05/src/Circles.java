import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {

  public static void mainDraw(Graphics graphics) {
      graphics.setColor(new Color(255, 255, 255));
      graphics.fillRect(0, 0, 1500, 800);
      /*int sizeRandom = (int) (Math.random( ) * 1000);                  //random size
      int size = sizeRandom;*/
      int size = 700;                                                    // fix size
      int n = 5;                                                         // how deep do you want to go?
      int x = (WIDTH - size) / 2;
      int y = (HEIGHT - size) / 4;
      drawCircle(graphics, x, y, size, n);
  }

  static void drawCircle(Graphics graphics, int x, int y, int size, int n){
            if (n < 1){
        return;
      }
        graphics.setColor(new Color((int) (Math.random( ) * 256), (int) (Math.random( ) * 256), (int) (Math.random( ) * 256)));
        graphics.drawOval(x , y , size, size);

        graphics.setColor(new Color((int) (Math.random( ) * 256), (int) (Math.random( ) * 256), (int) (Math.random( ) * 256)));
        graphics.drawOval(x + size / 4, y, size / 2, size / 2);

        graphics.setColor(new Color((int) (Math.random( ) * 256), (int) (Math.random( ) * 256), (int) (Math.random( ) * 256)));
        graphics.drawOval((int) (x + size / 31.5), (int) (y + size / 2.71), size / 2, size / 2);

        graphics.setColor(new Color((int) (Math.random( ) * 256), (int) (Math.random( ) * 256), (int) (Math.random( ) * 256)));
        graphics.drawOval((int) (x + size / 2.138), (int) (y + size / 2.69), size / 2, size / 2);

        drawCircle(graphics, x + size / 4, y, size / 2, n - 1);
        drawCircle(graphics, (int) (x + (size / 30.4)), (int) (y + size / 2.70), size / 2, n - 1);
        drawCircle(graphics, (int) (x + (size / 2.14)), (int) (y + size / 2.70), size / 2, n - 1);
  }


  //    Don't touch the code below
  static int WIDTH = 1000;
  static int HEIGHT = 1000;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH * 2, HEIGHT * 2));
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