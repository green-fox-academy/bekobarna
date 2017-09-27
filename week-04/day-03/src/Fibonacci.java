public class Fibonacci {

    static int fibo(int index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return (fibo(index - 1) + fibo( index - 2));
        }
    }
}
