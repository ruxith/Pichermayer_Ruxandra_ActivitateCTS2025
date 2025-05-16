import Classes.MijlocTransport;

public class Autobuz extends MijlocTransport {

    public Autobuz(int nrLinie) {
        super(nrLinie);
    }

    @Override
    public void pleacaDeLaCapat() {
        trimiteMesaj("Autobuzul " + this.getNrLinie() + " a plecat de la capat de linie.");
    }
    public void schimbaTraseu(){
        trimiteMesaj("Se va schimba traseul pentru autobuzul: " + this.getNrLinie());
    }
}
