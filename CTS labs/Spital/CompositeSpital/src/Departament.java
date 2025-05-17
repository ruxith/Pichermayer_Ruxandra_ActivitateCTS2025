import java.util.ArrayList;
import java.util.List;

public class Departament implements DepartamentAbstract {
    private int nrAngajati;
    private String denumire;
    private List<DepartamentAbstract> departamente;

    public Departament(int nrAngajati, String denumire) {
        this.nrAngajati = nrAngajati;
        this.departamente = new ArrayList<DepartamentAbstract>();
        this.denumire = denumire;
    }


    @Override
    public void addNod(DepartamentAbstract departament) {
        departamente.add(departament);
    }

    @Override
    public DepartamentAbstract getNod(int index) {
        return departamente.get(index);
    }

    @Override
    public void deleteNod(DepartamentAbstract departament) {
        departamente.remove(departament);
    }

    @Override
    public void getInfo(String indent) {
        System.out.println(indent + "Departamentul " + this.denumire + ": ");
        for (DepartamentAbstract structura : this.departamente) {
            structura.getInfo(indent + "\t");
        }
    }

}
