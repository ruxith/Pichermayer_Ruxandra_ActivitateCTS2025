import classes.MedicamentAdapter;
import classes.MedicamentFarmacie;
import classes.MedicamentSpital;

public class Main {
    public static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital();
        medicamentSpital.achizitioneazaMedicament();

        MedicamentAdapter medicamentAdapter = new MedicamentAdapter(medicamentSpital);
        medicamentAdapter.cumparaMedicament();

        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie();
        medicamentFarmacie.cumparaMedicament();
    }
}