public class Station {
    int gasAmount;

    public void refill (Car car) {
        this.gasAmount -= Car.capacity;
        Car.gasAmount += Car.capacity;
    }

}
