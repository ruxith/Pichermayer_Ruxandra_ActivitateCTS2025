import Classes.Pacient;
import Classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = new PacientBuilder("Ruxandra Pichermayer");
        Pacient pacient1 = pacientBuilder.setGuestName("Daria").setHasRobe(true).getPacient();
//      pacient1.setGuestName("Andreea");

        Pacient pacient2 = pacientBuilder.setGuestName("David").setHasBreakfast(true).getPacient();

        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());
    }
}