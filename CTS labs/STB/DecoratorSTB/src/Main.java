import com.sun.jdi.connect.Transport;

public class Main {
    public static void main(String[] args) {
        ITransportTerestru transport = new TransportTerestru("25/04/2024", TipBilet.ABONAMENT);
        transport.valideazaCalatorie();

        TransportDecorator transportSarbatori = new TransportSarbatori(transport);
        transportSarbatori.valideazaCalatorie();
    }
}