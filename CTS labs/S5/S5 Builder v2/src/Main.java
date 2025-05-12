import Classes.Pacient;
import Classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder();
        pacientBuilder.setGuestName("Maria").setHasBreakfast(true).setHasRetractableBed(true);

        Pacient p1 = pacientBuilder.setHasSlippers(true).build("Ana");
        Pacient p2 = pacientBuilder.setHasBreakfast(true).setGuestName("Andreea").build("Bianca");
        Pacient p3 = pacientBuilder.setGuestName("Andrei").build("Marius");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

    }
}