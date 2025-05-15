package Classes;

public class HandlerTroleibuz extends Handler{

    public HandlerTroleibuz(Handler urmator) {
        super(urmator);
    }

    public HandlerTroleibuz() {
    }

    @Override
    public void gestioneazaCerere(int distanta) {
        if(distanta < 3){
            System.out.println("Gestioneaza cerere troleibuz.");
        } else if(urmator != null){
            urmator.gestioneazaCerere(distanta);
        }
    }
}
