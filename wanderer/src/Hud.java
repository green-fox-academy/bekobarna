import java.awt.Graphics;
import javax.swing.JComponent;

public class Hud extends JComponent {
    Hero hero;

    public Hud() {
        hero = new Hero();
    }

    public String heroStats() {
        return "Hero " + "(Level " + hero.level + ") HP: " + hero.hp + "/" + hero.maxHp + " | DP " + hero.dp + " | SP " + hero.sp;
    }

}
