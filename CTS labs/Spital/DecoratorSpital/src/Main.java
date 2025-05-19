import Classes.IRezultat;
import Classes.Pacient;
import Classes.Rezultat;
import decorator.RezultatOnline;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Rux", 5);
        Pacient pacient2 = new Pacient("David", 5);
        Pacient pacient3 = new Pacient("Daria", 5);

        RezultatOnline rezultatOnline = new RezultatOnline(new Rezultat());
        rezultatOnline.printareRezultat(pacient1);

        IRezultat rezultat = new Rezultat();
        rezultat.printareRezultat(pacient3);


    }
}