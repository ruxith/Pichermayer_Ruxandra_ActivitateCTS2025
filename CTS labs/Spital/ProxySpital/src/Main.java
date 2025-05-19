public class Main {
    public static void main(String[] args) {
        IPacient pacientProxy = new PacientProxy(new Pacient("Rux", true));
        pacientProxy.internare();
        IPacient pacientProxy2 = new PacientProxy(new Pacient("Rux", false));
        pacientProxy2.internare();
    }
}