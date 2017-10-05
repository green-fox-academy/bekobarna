import java.util.ArrayList;

public class Ship extends Pirates {
    ArrayList<Pirates> crew;
    Pirates captain;

    public Ship() {
        crew = new ArrayList<>();
    }

    public void fillShip() {
        captain = new Pirates();
        int number = (int)(Math.random() * 10);
        for (int i = 0; i < number; i++) {
            crew.add(new Pirates());
        }
        System.out.println("ship is done");
    }

    public int aliveCrewMembers() {
        int alive = 0;
        for (Pirates p : crew) {
            if (p.alive) {
                alive++;
            }
        }
        return alive;
    }

    public String shipStatus() {
        if (!captain.alive) {
            return "the captain is dead";
        }
        else if (captain.alive && !captain.passedOut) {
            return "The captain is alive, and drank " + intoxication + " rums and there are " + aliveCrewMembers() + " alive crewmembers";
        } else {
            return "The captain drank too much and passed out";
        }
    }

    public int calculatedScore() {
        int score = aliveCrewMembers() - captain.intoxication;
        return score;
    }

    public boolean battle(Ship otherShip) {
        if (this.calculatedScore() > otherShip.calculatedScore()) {
            return true;
        } else {
            return false;
        }
    }

}
