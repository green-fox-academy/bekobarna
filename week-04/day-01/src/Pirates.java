public class Pirates {

    int intoxication;
    boolean passedOut;
    boolean alive;

    public int getIntoxication() {
        return intoxication;
    }

    public void setIntoxication(int intoxication) {
        this.intoxication = intoxication;
    }

    public Pirates(int intoxication, boolean passedOut, boolean alive) {
        this.intoxication = intoxication;
        this.passedOut = passedOut;
        this.alive = alive;
    }

    public Pirates() {
        this.intoxication = 0;
        this.passedOut = false;
        this.alive = true;
        //System.out.println("Creating a pirate");
    }

    public String drinkSomeRum() {
        if (alive = true) {
            intoxication++;
            return "okay";
        } else {
            return "he's dead";
        }
    }

    public String howsItGoingMate() {
        if (!alive) {
            return "he's dead";
        }
        if (intoxication < 5) {
            return "Pour me anudder!";
        } else {
            passedOut = true;
            return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
        }
    }

    public void die() {
        this.alive = false;
    }

    public void brawl(Pirates another) {
        System.out.println("Its brawling time!!");
        if (another.alive || this.alive) {
            return;
        }
        int number = (int)(Math.random()*3);
        if (number == 0) {
            this.die();
        } else if (number == 1) {
            another.die();
        } else {
            this.passedOut = true;
            another.passedOut = true;
        }
    }
}
