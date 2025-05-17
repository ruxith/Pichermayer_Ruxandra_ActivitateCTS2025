package Classes;

public class Rezultat implements IRezultat {
    @Override
    public void printareRezultat(Pacient pacient) {
        System.out.println("Se printeaza rezultatul pacientului " + pacient.getNume());
    }
}
