public class Animal {

    int hunger;
    int thirst;

    public Animal () {
        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat () {
        hunger -= 1;
    }

    public void drink () {
        thirst -= 1;
    }

    public void play () {
        this.thirst += 1;
        this.hunger += 1;

    }

    public static void main(String[] args) {
        Animal teve = new Animal();
        teve.drink();
        teve.drink();
        System.out.println(teve.thirst);

    }



}
