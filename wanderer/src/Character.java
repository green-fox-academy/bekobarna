public class Character {
    int posX;
    int posY;
    String image;
    int level;
    int hp;
    int sp;
    int dp;

    public int d6 () {
        int range = (6 - 1) + 1;
        return (int)(Math.random() * range) + 1;
    }
}
