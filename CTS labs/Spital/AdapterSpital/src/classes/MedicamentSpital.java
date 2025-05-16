package classes;

public class MedicamentSpital implements IMedicamentSpital {

    @Override
    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicament achiziționat pe baza de rețetă.");
    }

    @Override
    public void prezintaReteta() {
        System.out.println("Verificare rețetă...");
    }
}
