package Classes;

public class AdapterDeClase extends MedicamentSpital implements IMedicamentFarmacie{


    public AdapterDeClase(float pret, String nume) {
        super(pret, nume);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
