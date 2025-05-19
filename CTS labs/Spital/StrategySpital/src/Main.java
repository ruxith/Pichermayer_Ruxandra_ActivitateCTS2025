public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Rux");
        pacient.plateste(100);
        pacient.setModPlata(new PlataCard());
        pacient.plateste(250);
    }
}