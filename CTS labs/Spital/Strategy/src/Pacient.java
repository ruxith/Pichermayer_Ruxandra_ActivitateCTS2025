public class Pacient {
    private String nume;
    private ModPlata modPlata;
    private double soldCurent;

    public Pacient(ModPlata modPlata, String nume, double soldCurent) {
        this.modPlata = modPlata;
        this.nume = nume;
        this.soldCurent = soldCurent;
    }

    public Pacient(String nume) {
        this.nume = nume;
        this.modPlata = new PlataCash();
        this.soldCurent = 100.0;
    }

    public void plateste(double suma){
        modPlata.plateste(this.nume, suma, soldCurent);
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
}
