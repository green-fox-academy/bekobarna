package Reservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ReservationApp implements Reservationy {
    ArrayList<String> days = new ArrayList<>(Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"));
    String alpahabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Random r = new Random();

    public static void main(String[] args) {
        int size = 10;
        ReservationApp reservation = new ReservationApp();
        for (int i = 0; i < size; i++) {
            System.out.println("Booking# " + reservation.getCodeBooking() + " for " + reservation.getDowBooking());
        }
    }

    @Override
    public String getDowBooking() {
        String randomDay = days.get(r.nextInt(days.size()));
        return randomDay;
        }

    @Override
    public String getCodeBooking() {
        int length = 8;
        StringBuilder code = new StringBuilder();
        for (int j = 0; j < length; j++) {
            code.append(String.valueOf(alpahabet.charAt(r.nextInt(alpahabet.length()))));
        }
        return code.toString();
    }
}
