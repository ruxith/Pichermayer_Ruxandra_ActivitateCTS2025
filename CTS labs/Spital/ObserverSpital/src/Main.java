public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Ionescu");
        Pacient pacient2 = new Pacient("Voiculescu");
        Pacient pacient3 = new Pacient("Popescu");

        Spital spital = new Spital("Matei Bals");

        spital.adaugaObserver(pacient1);
        spital.adaugaObserver(pacient2);
        spital.adaugaObserver(pacient3);

        spital.notificaEpidemie();
        spital.stergeObserver(pacient2);
        spital.notificaVirus();
    }
}