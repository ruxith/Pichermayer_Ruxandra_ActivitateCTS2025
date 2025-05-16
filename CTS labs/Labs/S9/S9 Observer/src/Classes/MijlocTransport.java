package Classes;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements Observabil {
    private int nrLinie;
    private List<Observer> calatori;

    public MijlocTransport(int nrLinie) {
        this.nrLinie = nrLinie;
        this.calatori = new ArrayList<>();
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Observer calator : calatori) {
            calator.primesteMesaj(mesaj);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        this.calatori.remove(o);
    }

    @Override
    public void adaugaObserver(Observer o) {
        this.calatori.add(o);
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public abstract void pleacaDeLaCapat();
}
