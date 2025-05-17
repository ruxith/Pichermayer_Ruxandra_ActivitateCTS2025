public abstract class TransportDecorator implements ITransportTerestru{
    ITransportTerestru transport;

    public TransportDecorator(ITransportTerestru transport) {
        this.transport = transport;
    }

    @Override
    public void valideazaCalatorie() {
        transport.valideazaCalatorie();
        printareMesaj();
    }

    protected abstract void printareMesaj();
}
