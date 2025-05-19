package Classes;

public class Client {
    private String nume;
    private String nrTelefon;
    private String adresaEmail;

    public Client( String nume, String adresaEmail, String nrTelefon) {
        this.adresaEmail = adresaEmail;
        this.nrTelefon = nrTelefon;
        this.nume = nume;
    }

    public Client(String nume) {
        this.nume = nume;
        this.adresaEmail = null;
        this.nrTelefon = null;
    }

    public String getAdresaEmail() {
        return adresaEmail;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getNume() {
        return nume;
    }
}
