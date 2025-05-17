public class Autobuz {
    private String model;
    private int anFabricatie;
    private int nrLocuri;

    public Autobuz(int anFabricatie, String model, int nrLocuri) {
        this.anFabricatie = anFabricatie;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "anFabricatie=" + anFabricatie +
                ", model='" + model + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
