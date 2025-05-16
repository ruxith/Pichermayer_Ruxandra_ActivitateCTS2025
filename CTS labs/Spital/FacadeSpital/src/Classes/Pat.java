package Classes;

public class Pat {
    private int nrPat;
    private Boolean esteLiber;

    public Pat(int nrPat) {

        this.nrPat = nrPat;
        this.esteLiber = nrPat % 2 == 0;
    }

    public Boolean getEsteLiber() {
        return esteLiber;
    }

    public int getNrPat() {
        return nrPat;
    }

    public void setEsteLiber(Boolean esteLiber) {
        this.esteLiber = esteLiber;
    }
}
