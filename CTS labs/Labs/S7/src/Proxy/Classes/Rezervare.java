package Proxy.Classes;

public class Rezervare implements IRezervare{

    @Override
    public void realizeazaRezervare(String numePersoana, int nrPersoane) {
        System.out.println("Rezervare confirmata pentru " + numePersoana
                + " de " + nrPersoane + " persoane.");
    }
}
