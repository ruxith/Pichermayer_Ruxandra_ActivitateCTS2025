package Classes;

import java.util.ArrayList;
import java.util.List;

public class FacadeUsa {

    private List<IUsa> listaUsi;

    public FacadeUsa() {
        this.listaUsi = new ArrayList<IUsa>();
        listaUsi.add(new UsaFata());
        listaUsi.add(new UsaMijloc());
        listaUsi.add(new UsaSpate());
    }

    public void adaugaUsa(IUsa usa){
        listaUsi.add(usa);
    }

    public void deschidereLibera() {
        for(IUsa usa : listaUsi) {
            usa.deschidereLiberUsa();
        }
    }

    public void deschidereFortata(){
        for(IUsa usa : listaUsi) {
            usa.deschidereFortataUsa();
        }
    }
}
