import java.util.ArrayList;

public class Carrier {
    ArrayList<Aircraft> aircrafts = new ArrayList<>();
    int ammoStored;
    int health;

    public Carrier(int ammo, int health) {
        this.health = health;
        this.ammoStored = ammo;
    }

    public void addAircraft(Aircraft type) {
        aircrafts.add(type);

    }

    public void fill() {
        int currentFill;
        for (int i = 0; i < aircrafts.size(); i++) {
            aircrafts.get(i);


        }
    }

}
