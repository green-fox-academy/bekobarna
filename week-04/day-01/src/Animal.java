public class Animal {

    int hunger;
    int thirst;

    public Animal () {
        hunger = 50;
        thirst = 50;
    }

    public int eat () {
        return hunger - 1;
    }

    public int drink () {
        return thirst - 1;
    }

    public int play () {
        thirst += 1;
        hunger += 1;
        return thirst + hunger;
    }

    public static void main(String[] args) {
        Animal teve = new Animal();
        System.out.println(teve.hunger);

    }



}
