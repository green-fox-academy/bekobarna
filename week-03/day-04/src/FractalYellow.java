import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalYellow {

  public static void squareDraw(Graphics graphics, int x, int y, int size){
    size = WIDTH / 3;

    graphics.drawRect(x , y , size, size);
    graphics.drawRect(x + size, y + size, size, size);
    graphics.drawRect(x + 2*size, y + 2*size , size, size);
    graphics.drawRect(x + 2*size, y, size, size);
    graphics.drawRect(x + size, y, size, size);
    graphics.drawRect(x + 2*size , y + 2*size , size, size);
    graphics.drawRect(x , y + size, size, size);
    graphics.drawRect(x , y + 2*size, size, size);
    graphics.drawRect(x + 2*size, y + size, size, size);
    graphics.drawRect(x +size , y + 2*size, size, size);
  }


  public static void mainDraw(Graphics graphics) {
    graphics.setColor(new Color(254, 249, 53));
    graphics.fillRect(0, 0, 1000, 1000);
    graphics.setColor(Color.BLACK);

    int startX = 0;
    int startY = 0;
    int size = WIDTH/6;

    if (size < WIDTH) {
      squareDraw(graphics, startX + 10, startY + 10, size);
    }



  }


  //    Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(1000, 1000));
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