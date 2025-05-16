package Classes;

public class HandlerAutobuz extends Handler {

    public HandlerAutobuz(Handler urmator) {
        super(urmator);
    }

    public HandlerAutobuz() {
    }

    @Override
    public void gestioneazaCerere(int distanta) {
        if(distanta <= 5){
            System.out.println("Gerstiune cerere autobuz.");
        } else  if(urmator != null){
            urmator.gestioneazaCerere(distanta);
        }
    }
}
