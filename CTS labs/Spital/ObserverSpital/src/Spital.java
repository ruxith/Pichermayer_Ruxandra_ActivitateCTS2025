import java.util.ArrayList;
import java.util.List;

public class Spital implements Observabil {

    private List<Observer> observers;
    private String numeSpital;

    public Spital(String numeSpital) {
        observers = new ArrayList<>();
        this.numeSpital = numeSpital;
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void trimiteNotificare(String notificare) {
        for (Observer observer : observers) {
            observer.receptioneazaNotificare(this.numeSpital + ": " + notificare);
        }
    }

    public void notificaVirus() {
        trimiteNotificare("A fost detectat un nou virus");
    }

    public void notificaEpidemie() {
        trimiteNotificare("A fost detectata o noua epidemie");
    }
}
