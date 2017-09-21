import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalYellow {

    public static void mainDraw(Graphics graphics) {
    graphics.setColor(new Color(254, 249, 53));
    graphics.fillRect(0, 0, 1000, 1000);
    graphics.setColor(Color.BLACK);

    int x = 10;
    int y = 10;
    int size = HEIGHT;

    for (int i = 0; i < 20; i++) {
        squareDraw(graphics, 10 * i, 10 * i, size);
        size = size / 2;
        x += 10;
        y += 10;

      }

   /* if (n < 100) {
      squareDraw(graphics, x , y, size, n);
    } else {

    }*/

  }


  static void squareDraw(Graphics graphics, int x, int y, int size){
    size = WIDTH / 3;

    graphics.drawLine(0, HEIGHT / 3, HEIGHT, HEIGHT / 3 );
    graphics.drawLine(0, (2 * HEIGHT / 3), HEIGHT, (2 * HEIGHT / 3));
    graphics.drawLine(WIDTH / 3, 0, HEIGHT / 3, HEIGHT );
    graphics.drawLine(2 * WIDTH/3, 0, 2 * WIDTH / 3, HEIGHT);

    /*graphics.drawRect(x , y , size, size);
    graphics.drawRect(x + size, y + size, size, size);
    graphics.drawRect(x + 2*size, y + 2*size , size, size);
    graphics.drawRect(x + 2*size, y, size, size);
    graphics.drawRect(x + size, y, size, size);
    graphics.drawRect(x + 2*size , y + 2*size , size, size);
    graphics.drawRect(x , y + size, size, size);
    graphics.drawRect(x , y + 2*size, size, size);
    graphics.drawRect(x + 2*size, y + size, size, size);
    graphics.drawRect(x +size , y + 2*size, size, size);*/
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