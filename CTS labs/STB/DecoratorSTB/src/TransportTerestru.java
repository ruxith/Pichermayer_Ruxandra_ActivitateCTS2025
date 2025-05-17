public class TransportTerestru implements ITransportTerestru {
    private String data;
    TipBilet tipBilet;

    public TransportTerestru(String data, TipBilet tipBilet) {
        this.data = data;
        this.tipBilet = tipBilet;
    }

    private void valideazaBilet() {
        System.out.println("Bilet validat in data " + data);
    }

    private void valideazaAbonament() {
        System.out.println("Abonament validat in data " + data);
    }

    @Override
    public void valideazaCalatorie() {
        if(tipBilet == TipBilet.ABONAMENT) {
            valideazaAbonament();
        } else {
            valideazaBilet();
        }
    }
}
