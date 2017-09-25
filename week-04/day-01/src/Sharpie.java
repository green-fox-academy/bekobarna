public class Sharpie {

    String color;
    Float width;
    Float inkAmount;

    public Sharpie () {
        inkAmount = 100.0f;
    }

    public Float use () {
        inkAmount = inkAmount - 1.0f;
        return inkAmount;
    }


    public static void main(String[] args) {
        Sharpie toll = new Sharpie();
        toll.use();
        toll.use();
        toll.use();
        toll.use();
        toll.use();

        System.out.println(toll.inkAmount);

    }
}
