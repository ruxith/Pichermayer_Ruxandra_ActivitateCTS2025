public class Pacient implements Observer {
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void receptioneazaNotificare(String notificare) {
        System.out.println(this.nume + ": ai primit notificarea: \n" + notificare);

    }
}
