package Classes;

public class HandlerMetrou extends Handler{

    public HandlerMetrou(Handler urmator) {
        super(urmator);
    }

    public HandlerMetrou() {
    }

    @Override
    public void gestioneazaCerere(int distanta) {
        System.out.println("Gestioneaza cerere metrou.");
    }
}
