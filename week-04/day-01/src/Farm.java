import java.util.ArrayList;
import java.util.List;

public class Farm {
    int slots = 5;
    List<Animal> farm = new ArrayList<>();

    Animal lion = new Animal();
    Animal zebra = new Animal();
    Animal dog = new Animal();
    Animal cat = new Animal();
    Animal turtle = new Animal();

    public void add (Animal animals) {
        farm.add(lion);
        farm.add(zebra);
        farm.add(turtle);
        farm.add(cat);
        farm.add(dog);
    }

    public void breed (){
        if (slots > 0) {
            Animal hippo = new Animal();
            farm.add(hippo);
        }
    }

    public void slaughter() {
        Animal leastHungry = new Animal();
        for (int i = 0; i < farm.size(); i++) {
            if (farm.get(i).hunger < farm.get(i + 1).hunger) {
                leastHungry = farm.get(i);
            }
            farm.remove(leastHungry);
        }
    }
}
