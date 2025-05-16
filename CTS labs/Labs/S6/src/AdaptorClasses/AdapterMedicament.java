package AdaptorClasses;

public class AdapterMedicament extends MedicamentFarmacie{
    private Classes.MedicamentSpital medicamentSpital;

    public AdapterMedicament(float pret, String nume, boolean esteInStoc) {
        super(pret, nume, esteInStoc);
    }

    public AdapterMedicament(Classes.MedicamentSpital medicamentSpital) {
        super(medicamentSpital.getPret(), medicamentSpital.getNume(), true);
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
