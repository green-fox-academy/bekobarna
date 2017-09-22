import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tree {

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(new Color(255, 255, 255));
    graphics.fillRect(0, 0, 1500, 800);

    int n = 7;
    int x = WIDTH / 2;
    int y = 600;
    double angle = 90;

    drawTree(graphics, x, y, angle, n);
  }


  private static void drawTree(Graphics g, int x1, int y1, double angle, int n) {
    int red = (int) (Math.random( ) * 256);
    int green = (int) (Math.random() * 256);
    int blue = (int) (Math.random() * 256);

    if (n < 1){
      return;
    }
    if (n == 0)
      return;
    int x2 = x1 - (int) (Math.cos(Math.toRadians(angle)) * n * 20);
    int y2 = y1 - (int) (Math.sin(Math.toRadians(angle)) * n * 20);
    g.setColor(new Color(red, green, blue));
    g.drawLine(x1, y1, x1 + n, y1 + n);
    g.setColor(new Color(red, green, blue));
    g.drawLine(x1, y1, x2, y2);


    g.setColor(new Color(red, green, blue));
    drawTree(g, x2, y2, angle - 45,  n - 1);
    g.setColor(new Color(red, green, blue));
    drawTree(g, x2, y2, angle + 45,  n - 1);
    g.setColor(new Color(red, green, blue));
    drawTree(g, x2, y2,  angle ,  n - 1);
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
  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }
}

