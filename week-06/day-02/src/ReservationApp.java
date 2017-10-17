import java.util.ArrayList;
import java.util.Arrays;

public class ReservationApp implements Reservationy{
    ArrayList<String> days = new ArrayList<>(Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"));
    int random = (int) (Math.random() * 10);
    String reservationCode;



    public static void main(String[] args) {

    }

    @Override
    public String getDowBooking() {
        return null;
    }

    @Override
    public String getCodeBooking() {
        return null;
    }
}
