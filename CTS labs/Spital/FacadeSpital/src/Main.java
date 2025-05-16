import Classes.Facade;
import Classes.Medic;
import Classes.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ruxandra", 7);
        Pacient pacient1 = new Pacient("Andreea", 7);
        Medic medic = new Medic("Cardiologie");

        Facade facade = new Facade();
        facade.verificaInternarePacient(pacient, medic);
        facade.verificaInternarePacient(pacient1, medic);

    }
}