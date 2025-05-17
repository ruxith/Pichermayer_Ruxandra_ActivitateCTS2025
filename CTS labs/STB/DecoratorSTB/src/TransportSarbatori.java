import com.sun.jdi.connect.Transport;

public class TransportSarbatori extends TransportDecorator {

    public TransportSarbatori(ITransportTerestru transport) {
        super(transport);
    }

    @Override
    protected void printareMesaj() {
        System.out.println("La multi ani!");
    }
}
