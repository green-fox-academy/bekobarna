public class Sharpie {

    String color;
    Float width;
    Float inkAmount;

    public Sharpie (String inputColor) {
        this.color = inputColor;
    }

    public Sharpie (Float widthInput) {
        this.width = widthInput;
    }

    public Sharpie () {
        this.inkAmount = 100.0f;
    }

    public void use () {
        this.inkAmount -= 1.0f;
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
