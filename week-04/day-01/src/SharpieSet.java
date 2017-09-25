import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

   List<Sharpie> sharpies = new ArrayList<>();

   Sharpie orange = new Sharpie("orange", 56f);
   Sharpie green = new Sharpie("green", 2.6f);
   Sharpie black = new Sharpie("black", 1.2f);

   public void add(Sharpie sharpie) {
       sharpies.add(orange);
       sharpies.add(green);
       sharpies.add(black);
   }

    public void countUseable () {
        int useable = 0;
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount > 0) {
                useable ++;
            }
        }
    }

    public void removeTrash () {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount == 0){
                sharpies.remove(i);
            }
        }
    }
}
