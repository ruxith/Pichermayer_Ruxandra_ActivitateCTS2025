public class Pacient implements IPacient {

    private String nume;
    private boolean areAsigurare;

    public Pacient(String nume, boolean areAsigurare) {
        this.areAsigurare = areAsigurare;
        this.nume = nume;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }

    public String getNume() {
        return nume;
    }



    @Override
    public void descriere() {
        System.out.println(this.getNume() +  " " + (areAsigurare?" are asigurare":"nu are asigurare"));
    }

    @Override
    public void internare() {
        System.out.println("Pacientul " + getNume() + " a fost internat.");
    }
}
