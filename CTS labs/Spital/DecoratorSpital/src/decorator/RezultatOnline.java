package decorator;

import Classes.IRezultat;
import Classes.Pacient;

public class RezultatOnline extends RezultatDecorator {

    public RezultatOnline(IRezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void printareRezultat(Pacient pacient) {
        super.printareRezultat(pacient);
        publicareRezultat(pacient);
    }

    @Override
    protected void publicareRezultat(Pacient pacient) {
        System.out.println("Se publica online rezultatul pacientului " + pacient.getNume());
    }
}
