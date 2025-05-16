package Classes;

public class HandlerTramvai extends Handler{

    public HandlerTramvai(Handler urmator) {
        super(urmator);
    }

    public HandlerTramvai() {
    }

    @Override
    public void gestioneazaCerere(int distanta) {
        if(distanta < 10){
            System.out.println("Gestioneaza cerere tramvai.");
        } else if(urmator != null){
            urmator.gestioneazaCerere(distanta);
        }
    }
}
