package decorator;

import Classes.IRezultat;
import Classes.Pacient;

public abstract class RezultatDecorator implements IRezultat {
    protected IRezultat rezultat;

    public RezultatDecorator(IRezultat rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public void printareRezultat(Pacient pacient) {
        rezultat.printareRezultat(pacient);
    }

    protected abstract void publicareRezultat(Pacient pacient);
}
