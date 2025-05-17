public class Linie implements ILinie {

    private int nrLinie;
    private String statieInceput;
    private String statieFinal;

    public Linie(int nrLinie, String statieFinal, String statieInceput) {
        this.nrLinie = nrLinie;
        this.statieFinal = statieFinal;
        this.statieInceput = statieInceput;
    }

    @Override
    public String toString() {
        return "Linie{" +
                "nrLinie=" + nrLinie +
                ", statieInceput='" + statieInceput + '\'' +
                ", statieFinal='" + statieFinal + '\'' +
                '}';
    }

    @Override
    public void descriere(Autobuz autobuz) {
        System.out.println(this.toString() + "\n" + autobuz.toString());
    }
}
