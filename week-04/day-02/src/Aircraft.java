public class Aircraft {
    int ammo;
    int maxAmmo;
    int baseDamage;
    int damageDealt;
    String type;


    public Aircraft(int maxAmmo, int baseDamage, String type) {
        this.ammo = 0;
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.type = type;
    }

    public void fight() {
        damageDealt = baseDamage * ammo;
        ammo = 0;
    }

    public int refill(int amount) {
        int ammoRefill = amount - maxAmmo;
        return ammoRefill;
    }

    public String getType() {
        return this.type;
    }

    public void getStatus() {
        System.out.println("Type " + type + ", Ammo: " + ammo + ", Base damage: " + baseDamage + ", All damage: " + damageDealt);
    }

}
