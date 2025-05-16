package Classes;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private int nrSalon;
    private List<Pat> paturiLibere;

    public Salon(int nrSalon) {

        this.nrSalon = nrSalon;

        this.paturiLibere = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            paturiLibere.add(new Pat(i + 1));
        }
    }

    public Boolean getDisponibilitatePat(int nr){
        return  paturiLibere.get(nr).getEsteLiber();
    }

    public Pat getPat(int nr){
        return paturiLibere.get(nr);
    }

    public int getNrSalon() {
        return nrSalon;
    }
}
