package classes;

public class TransportTerestru implements  ITransportTerestru {

    private String data;
    TipBilet tipBilet;

    public TransportTerestru(String data, TipBilet tipBilet) {
        this.data = data;
        this.tipBilet = tipBilet;
    }

    @Override
    public void valideazaBilet() {
        System.out.println("Bilet validat in data " + data);
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("Abonament validat in data " + data);
    }

    @Override
    public void validare() {
        if(tipBilet == TipBilet.ABONAMENT) {
            valideazaAbonament();
        } else {
            valideazaBilet();
        }
    }
}
