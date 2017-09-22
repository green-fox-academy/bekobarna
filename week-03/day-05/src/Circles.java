import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(new Color(255, 255, 255));
    graphics.fillRect(0, 0, 1000, 1000);
    graphics.setColor(Color.BLACK);

    int size = 500;
    int n = 3;                  //not sure about the number
    int x = (WIDTH - size) / 3;
    int y = (HEIGHT - size) / 3;

    drawCircle(graphics, x, y, size, n);
  }


  static void drawCircle(Graphics graphics, int x, int y, int size, int n){
    int red = (int) (Math.random( ) * 256);
    int green = (int) (Math.random() * 256);
    int blue = (int) (Math.random() * 256);

    if (n < 1){
      return;
    }

    graphics.setColor(Color.BLACK);
    graphics.drawOval(x , y , size, size);

   /* graphics.setColor(new Color(red, green, blue));
    graphics.drawOval(x + 17, y + size / 3  + 20, size / 2, size / 2);

    graphics.setColor(new Color(red, green, blue));
    graphics.drawOval(x + 2 * size / 3 - 100, y + size / 3 + 20, size / 2, size / 2);*/

    graphics.setColor(Color.RED);
    graphics.drawOval(x + size / 4, y, size / 2, size / 2);

    graphics.setColor(Color.GREEN);
    graphics.drawOval(x + size / 29, (int) (y + size / 2.69), size / 2, size / 2);

    graphics.setColor(Color.ORANGE);
    graphics.drawOval((int) (x + size / 2.14), (int) (y + size / 2.69), size / 2, size / 2);


    drawCircle(graphics, x + size / 4, y, size / 2, n - 1);
    drawCircle(graphics, (int) (x + (size / 28)), (int) (y + size / 2.70), size / 2, n - 1);
    drawCircle(graphics, x + size / 4, y, size / 2, n - 1);

    /*drawCircle(graphics, x , y, size / 2, n - 1);
    drawCircle(graphics, x, y, size / 2, n - 1);*/

    /*drawCircle(graphics, x + size / 3, y + size / 3, size / 3, n - 1);
    drawCircle(graphics, x + 2 * size / 3, y + 2 * size / 3, size / 3, n - 1);*/

  }


  //    Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

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