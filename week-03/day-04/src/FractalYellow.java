import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalYellow {

    public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.YELLOW);
    graphics.fillRect(0, 0, 1000, 1000);
    graphics.setColor(Color.BLACK);
    /*int sizeRandom = (int) (Math.random( ) * 1000);                  //random size
    int size = sizeRandom;*/
    int size = 500;
    int n = 4;                              //level of deepness
    int x = (WIDTH - size) / 2;
    int y = (HEIGHT - size) / 2;
    squareDraw(graphics, x, y, size, n);
    }


  static void squareDraw(Graphics graphics, int x, int y, int size, int n){
      if (n < 1){
        return;
      }
      graphics.drawRect(x , y , size, size);
      graphics.drawRect(x + size / 3, y, size / 3, size / 3);
      graphics.drawRect(x, y + size / 3 , size / 3, size / 3);
      graphics.drawRect(x + size / 3, y + size * 2 / 3, size / 3, size / 3);
      graphics.drawRect(x + size * 2 / 3, y +  size / 3, size / 3, size / 3);

      squareDraw(graphics, x + size / 3, y, size / 3, n - 1);
      squareDraw(graphics, x + size * 2 / 3, y + size / 3, size / 3, n - 1);
      squareDraw(graphics, x, y + size / 3, size / 3, n - 1);
      squareDraw(graphics, x + size / 3, y + size * 2 / 3, size / 3, n - 1);
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