public class Shifter implements CharSequence {
    String word;
    int shift;

    public Shifter(String input, int shiftNumber) {
        this.word = input;
        this.shift = shiftNumber;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        if (index >= word.length()) {
            return word.charAt(word.length() - 1);
        } else {
            return word.charAt(index + 2);
        }
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    public static void main(String[] args) {
        Shifter s = new Shifter("example", 2);
        System.out.println(s.charAt(0));
        // should print out: a
    }
}
