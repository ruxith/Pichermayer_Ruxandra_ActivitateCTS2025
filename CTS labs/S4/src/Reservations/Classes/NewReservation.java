package Reservations.Classes;

public class NewReservation extends Reservation{

    public NewReservation(String name, int noPers, String date, String time) {
        super(name, noPers, date, time);
    }
    public NewReservation(){

    }

    @Override
    public void description() {
        System.out.println("Hi, " + getName() + ". " + "You have a rezervation on " + getDate() + " at " + getTime());
    }

    @Override
    public Reservation copy() {
        NewReservation reservation = new NewReservation();
        reservation.setName(this.getName());
        reservation.setDate(this.getDate());
        reservation.setTime(this.getTime());
        reservation.setNoPers(this.getNoPers());

        return reservation;

    }
}
