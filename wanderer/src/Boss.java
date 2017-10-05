public class Boss extends Character {

    public Boss() {

        this.image = "assets/boss.png";
        this.level = 1;
        this.maxHp = (2 * level * d6()) + d6();
        this.dp = ((level / 2) * d6()) + (d6() / 2);
        this.sp = (level * d6()) + level;
        this.hp = this.maxHp;
        this.dead = false;

    }

    /*public Boss(int x, int y) {
        this.posX = x;
        this.posY = y;
        this.image = "assets/boss.png";
        this.level = 1;
        this.maxHp = (2 * level * d6()) + d6();
        this.dp = ((level / 2) * d6()) + (d6() / 2);
        this.sp = (level * d6()) + level;
        this.hp = this.maxHp;
    }*/

}
