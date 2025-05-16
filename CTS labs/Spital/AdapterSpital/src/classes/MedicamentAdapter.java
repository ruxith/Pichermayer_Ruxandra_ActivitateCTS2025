package classes;

public class MedicamentAdapter implements IMedicamentFarmacie{

    MedicamentSpital medicamentSpital;

    public MedicamentAdapter(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        this.medicamentSpital.achizitioneazaMedicament();
    }
}
