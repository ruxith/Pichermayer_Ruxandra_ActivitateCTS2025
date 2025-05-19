package classes;

public class Pacient {
    private String nume;
    private int severitate;

    public Pacient(String nume, int severitate) {
        this.nume = nume;
        this.severitate = severitate;
    }

    public String getNume() {
        return nume;
    }

    public int getSeveritate() {
        return severitate;
    }
}