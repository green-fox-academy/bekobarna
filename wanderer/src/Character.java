public class Character {
    int posX;
    int posY;
    String image;
    int level;
    double maxHp;
    double hp;
    double sp;
    double dp;
    boolean dead;

    public int d6 () {
        int range = (6 - 1) + 1;
        return (int)(Math.random() * range) + 1;
    }

    public boolean strike(Character enemy) {
        double sv = this.sp + (2 * d6());
        boolean success;
        if (sv > enemy.dp) {
            enemy.hp -= sv;
            success = true;
        } else {
            success = false;
        }
        return success;
    }

    public void battle (Character char1, Character char2) {

    }
    }
