import java.util.ArrayList;
import java.util.List;

public class GrupAuto implements ComponentaFlota {
    private List<ComponentaFlota> componenteFlota;
    private String denumireGrup;

    public GrupAuto(String denumireGrup) {
        this.denumireGrup = denumireGrup;
        componenteFlota = new ArrayList<ComponentaFlota>();
    }

    @Override
    public ComponentaFlota getNod(int index) throws Exception {
        return componenteFlota.get(index);
    }

    @Override
    public void addNod(ComponentaFlota componenta) throws Exception {
        componenteFlota.add(componenta);
    }

    @Override
    public void removeNod(ComponentaFlota componenta) throws Exception {
        componenteFlota.remove(componenta);
    }

    @Override
    public void getInfo(String indent) {
        System.out.println(indent + "Grup Auto: " + denumireGrup);
        for (ComponentaFlota c : componenteFlota) {
            c.getInfo(indent + "\t");
        }
    }
}
