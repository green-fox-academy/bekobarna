public class Skeleton extends Character {

    public Skeleton() {
        this.image = "assets/skeleton.png";
        this.level = 1;
        this.maxHp = 2 * level * d6();
        this.dp = (level / 2) * d6();
        this.sp =  level * d6();
        this.hp = this.maxHp;
        this.dead = false;

    }

    /*public Skeleton(int x, int y) {
        this.posX = x;
        this.posY = y;
        this.image = "assets/skeleton.png";
        this.level = 1;
        this.maxHp = 2 * level * d6();
        this.dp = (level / 2) * d6();
        this.sp =  level * d6();
        this.hp = this.maxHp;
    }*/

}
