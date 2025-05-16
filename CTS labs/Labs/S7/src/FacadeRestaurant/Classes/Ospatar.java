package FacadeRestaurant.Classes;

public class Ospatar {

    public boolean esteAranjataMasa(Masa masa){
        return masa.getNrMasa() % 4 == 0;
    }
}
