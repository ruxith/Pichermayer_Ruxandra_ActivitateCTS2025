package classes;

public class InternareUrgenta extends ProcesInternare {

    public InternareUrgenta(String numeSpital) {
        super(numeSpital);
    }

    @Override
    protected void analizeazaStare(Pacient pacient) {
        System.out.println("Analizăm urgent starea critică a pacientului " + pacient.getNume());
    }

    @Override
    protected boolean verificareDisponibilitateSalon(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " este în stare critică. Internare directă.");
        return true;
    }

    @Override
    protected void emitereFisaInternare(Pacient pacient) {
        System.out.println("Se emite fisa de internare pentru pacientul " + pacient.getNume() + " (URGENȚĂ)");
    }
}
