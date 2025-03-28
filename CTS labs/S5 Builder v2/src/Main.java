import Classes.Pacient;
import Classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder();
        pacientBuilder.setGuestName("Maria").setHasBreakfast(true).setHasRetractableBed(true);

        Pacient p1 = pacientBuilder.build("Ana");
        Pacient p2 = pacientBuilder.setGuestName("Andreea").build("Bianca");
        Pacient p3 = pacientBuilder.setGuestName("Andrei").build("Marius");

        System.out.println(p1.toString() + p2.toString() + p3.toString());

    }
}