import classes.AdapterTransportSubteran;
import classes.TipBilet;
import classes.TransportSubteran;
import classes.TransportTerestru;

public class Main {
    public static void main(String[] args) {
        TransportTerestru autobuz = new TransportTerestru("2025-05-16", TipBilet.BILET);
        autobuz.validare();

        TransportTerestru tramvai = new TransportTerestru("2025-07-06", TipBilet.ABONAMENT);
        tramvai.validare();

        TransportSubteran metrouVechi = new TransportSubteran("2025-03-20");
        metrouVechi.valideazaCalatorie();

        AdapterTransportSubteran metrou = new AdapterTransportSubteran(autobuz);
        metrou.valideazaCalatorie();

        AdapterTransportSubteran metrouAbonament = new AdapterTransportSubteran(tramvai);
        metrouAbonament.valideazaCalatorie();
    }
}