public class Counter {
    int number;

    public Counter() {
        this.number = 0;
    }

    public Counter(int input) {
     this.number = input;
    }

    public void add(int number2) {
        this.number = this.number + number2;
    }

    public void add() {
        this.number += 1;
    }

    public int get() {
        return number;
    }
    public void reset() {
        this.number = 0;
    }

    public static void main(String[] args) {
        Counter first = new Counter(10);
        first.add(10);
        System.out.println(first.number);

    }
}
