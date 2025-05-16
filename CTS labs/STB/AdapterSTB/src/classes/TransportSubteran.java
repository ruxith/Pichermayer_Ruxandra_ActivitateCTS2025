package classes;

public class TransportSubteran implements  ITransportSubteran {

    private String data;

    public TransportSubteran(String data) {
        this.data = data;
    }

    @Override
    public void valideazaCalatorie() {
        System.out.println("Calatorie valida in data: " + data);
    }
}

