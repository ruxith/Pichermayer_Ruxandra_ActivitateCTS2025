package classes;

public class MedicamentFarmacie implements IMedicamentFarmacie {

    @Override
    public void cumparaMedicament() {
        System.out.println("Medicament achiziționat fără rețetă.");
    }
}
