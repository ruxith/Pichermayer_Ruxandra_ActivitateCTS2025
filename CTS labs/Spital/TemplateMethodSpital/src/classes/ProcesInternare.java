package classes;

public abstract class ProcesInternare {
    private String numeSpital;

    public ProcesInternare(String numeSpital) {
        this.numeSpital = numeSpital;
    }

    public String getNumeSpital() {
        return numeSpital;
    }

    protected abstract void analizeazaStare(Pacient pacient);
    protected abstract boolean verificareDisponibilitateSalon(Pacient pacient);
    protected abstract void emitereFisaInternare(Pacient pacient);

    public final void internarePacient(Pacient pacient) {
        analizeazaStare(pacient);
        if(verificareDisponibilitateSalon(pacient)){
            emitereFisaInternare(pacient);
        } else {
            System.out.println("Ne pare rau, dar momentan nu exista disponibilitate.");
        }

    }
}
