import classes.InternareStandard;
import classes.InternareUrgenta;
import classes.Pacient;
import classes.ProcesInternare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ionescu", 3);
        Pacient pacient1 = new Pacient("Popescu", 7);

        ProcesInternare internareStd = new InternareStandard("Matei Bals");
        ProcesInternare internareU = new InternareUrgenta("Matei Bals");

        internareStd.internarePacient(pacient);
        System.out.println("----------------------------");
        internareU.internarePacient(pacient1);
    }
}