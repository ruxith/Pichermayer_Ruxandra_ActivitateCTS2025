import java.util.HashMap;

public class LinieFactory {

    private HashMap<Integer, Linie> listaLiniiAutobuz;

    public LinieFactory() {
        this.listaLiniiAutobuz = new HashMap<>();
    }

    public ILinie getLinie(int nrLinie) {
        if(listaLiniiAutobuz.containsKey(nrLinie)) {
            return listaLiniiAutobuz.get(nrLinie);
        } else {
            ILinie linie = new Linie(nrLinie,"Preciziei", "Anghel Saligny");
            listaLiniiAutobuz.put(nrLinie, (Linie)linie);
            return linie;
        }

    }
}
