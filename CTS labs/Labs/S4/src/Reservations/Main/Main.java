package Reservations.Main;

import Reservations.Classes.NewReservation;
import Reservations.Classes.Reservation;

public class Main {
    public static void main(String[] args) {
        Reservation reservation = new NewReservation("Ruxandra Pichermayer", 4, "15/10/25", "20:00");
        Reservation reservation2 = reservation.copy();

        reservation.description();
        reservation2.description();
    }
}
