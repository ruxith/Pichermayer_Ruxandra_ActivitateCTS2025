import Classes.Calator;
import Classes.MijlocTransport;
import Classes.Observer;

public class Main {
    public static void main(String[] args) {
        Observer calator1 = new Calator("Ana");
        Observer calator2 = new Calator("Ruxi");
        Observer calator3 = new Calator("Andrei");

        MijlocTransport autobuz1 = new Autobuz(100);
        autobuz1.adaugaObserver(calator1);
        autobuz1.adaugaObserver(calator2);
        autobuz1.adaugaObserver(calator3);
        autobuz1.pleacaDeLaCapat();
        autobuz1.removeObserver(calator1);
        ((Autobuz)autobuz1).schimbaTraseu();
    }
}