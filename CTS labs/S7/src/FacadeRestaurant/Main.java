import Classes.Masa;
import Classes.Ospatar;
import Classes.Picolo;
import FacadeRestaurant.FacadeRestaurant;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Masa> listaMese = new ArrayList<>();
        for(int i = 1; i <= 8; i++){
            listaMese.add(new Masa(i, true));
        }
        listaMese.add(new Masa(10, false));
        FacadeRestaurant facadeRestaurant = new FacadeRestaurant();

        System.out.println(facadeRestaurant.verificaAsezareMasa(listaMese.get(4)));
        System.out.println(facadeRestaurant.verificaAsezareMasa(listaMese.get(3)));
        System.out.println(facadeRestaurant.verificaAsezareMasa(listaMese.get(8)));
    }
}