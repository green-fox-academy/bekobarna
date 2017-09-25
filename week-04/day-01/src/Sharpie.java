public class Sharpie {

    String color;
    Float width;
    Float inkAmount;

    public Sharpie (String inputColor) {
        this.color = inputColor;
    }

    public Sharpie(String orange, Float widthInput) {
        this.width = widthInput;
    }

    public Sharpie () {
        this.inkAmount = 100.0f;
    }

    public void use () {
        this.inkAmount -= 1.0f;
    }
}
