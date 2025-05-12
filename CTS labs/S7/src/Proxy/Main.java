import Classes.IRezervare;
import Classes.Rezervare;
import Classes.RezervareProxy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IRezervare rezervare = new Rezervare();
        IRezervare rezervareProxy = new RezervareProxy(rezervare);

        rezervareProxy.realizeazaRezervare("Pop Irina", 2);
        rezervareProxy.realizeazaRezervare("Pop Ioana", 4);

    }
}