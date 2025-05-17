import java.util.ArrayList;
import java.util.List;

public class Sectie implements DepartamentAbstract {
    private int nrAngajati;
    private String denumire;

    public Sectie(int nrAngajati, String denumire) {
        this.nrAngajati = nrAngajati;
        this.denumire = denumire;
    }

    @Override
    public void addNod(DepartamentAbstract departament) throws Exception {
        throw new Exception("Nu este implementata functia.");
    }

    @Override
    public DepartamentAbstract getNod(int index) throws Exception {
        throw  new Exception("Nu este implementata functia.");
    }

    @Override
    public void deleteNod(DepartamentAbstract departament) throws Exception {
        throw new Exception("Nu este implementata functia.");

    }

    @Override
    public void getInfo(String indent) {
        System.out.println(indent + "Sectia " + denumire + " - " + this.nrAngajati + " locuri");
    }
}
