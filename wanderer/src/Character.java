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
}
