public class Autobuz implements ComponentaFlota {

    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.model = model;
        this.nrLocuri = nrLocuri;
        this.producator = producator;
    }

    @Override
    public ComponentaFlota getNod(int index) throws Exception {
        throw new Exception("Nu este implementata metoda.");
    }

    @Override
    public void addNod(ComponentaFlota componenta) throws Exception {
        throw new Exception("Nu este implementata metoda.");

    }

    @Override
    public void removeNod(ComponentaFlota componenta) throws Exception {
        throw new Exception("Nu este implementata metoda.");

    }

    @Override
    public void getInfo(String indent) {
        System.out.println(indent + "Autobuz: " + producator + "; model: " + model + "; nrlocuri: " + nrLocuri);
    }
}
