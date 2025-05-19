package classes;

import java.util.Random;

public class InternareStandard extends ProcesInternare {


    public InternareStandard(String numeSpital) {
        super(numeSpital);
    }

    @Override
    protected void analizeazaStare(Pacient pacient) {
        if(pacient.getSeveritate()>5){
            System.out.println(pacient.getNume() + " se afla intr-o stare grava.");
        } else {
            System.out.println(pacient.getNume() + " se afla intr-o stare cat de cat buna.");
        }
    }

    @Override
    protected boolean verificareDisponibilitateSalon(Pacient pacient) {
        boolean disponibil = new Random().nextBoolean();
        System.out.println("Verificăm disponibilitatea pentru pacientul " + pacient.getNume() +
                ": " + (disponibil ? "Disponibil" : "Indisponibil"));
        return disponibil;
    }

    @Override
    protected void emitereFisaInternare(Pacient pacient) {
        System.out.println("Se emite fisa de internare pentru pacientul " + pacient.getNume());
    }
}
