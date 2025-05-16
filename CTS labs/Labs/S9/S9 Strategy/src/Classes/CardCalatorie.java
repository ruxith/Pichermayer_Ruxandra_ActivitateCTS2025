package Classes;

public class CardCalatorie implements IMetodaPlata {

    int nrCalatorii;

    public int getNrCalatorii() {
        return nrCalatorii;
    }

    public void setNrCalatorii(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    public CardCalatorie(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void plateste(float pretBilet) {
        if(nrCalatorii>=0){
            System.out.println("Ai achitat o calatorie.");
            nrCalatorii--;
            System.out.println("Calatorii ramase: " + nrCalatorii);
        } else {
            System.out.println("Nu mai ai calatorii ramase.");
        }
    }
}
