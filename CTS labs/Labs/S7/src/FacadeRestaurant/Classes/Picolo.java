package FacadeRestaurant.Classes;

public class Picolo {

    public boolean esteDebarasata(Masa masa){
        return masa.getNrMasa() % 2 == 0;
    }
}
