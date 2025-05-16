package classes;

public class AdapterTransportSubteran implements ITransportSubteran {

    TransportTerestru transportTerestru;

    public AdapterTransportSubteran(TransportTerestru transportTerestru) {
        this.transportTerestru = transportTerestru;
    }

    @Override
    public void valideazaCalatorie() {
        transportTerestru.validare();
    }
}
