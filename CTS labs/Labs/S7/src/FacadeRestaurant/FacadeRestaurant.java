package FacadeRestaurant;

import Classes.Masa;
import Classes.Ospatar;
import Classes.Picolo;

public class FacadeRestaurant {
    Picolo picolo = new Picolo();
    Ospatar ospatar = new Ospatar();

    public String verificaAsezareMasa(Masa masa){
        if(masa.isEsteLibera()){
            if(picolo.esteDebarasata(masa)){
                if(ospatar.esteAranjataMasa(masa)){
                    return ("Va rog luati loc la masa: " + masa.getNrMasa());
                } else {
                    return ("Asteptati putin pentru a fi asezata masa");
                }
            }else {
                return("Asteptati putin pentru a fi debarasata si asezata masa");
            }
        }else {
            return("Nu avem locuri libere.");
        }
    }
}
