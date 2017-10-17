public class Gnirts implements CharSequence {
    String word;

    public Gnirts(String input) {
        this.word = input;
    }

    @Override
    public int length() {
        return word.length();
    }

    @Override
    public char charAt(int index) {
        return word.charAt(word.length() - 1 - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    public static void main(String[] args) {
        Gnirts g = new Gnirts("example");
        System.out.println(g.charAt(1));
        // should print out: l
    }
}
