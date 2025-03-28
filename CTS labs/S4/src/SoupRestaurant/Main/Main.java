package SoupRestaurant.Main;

import S4.SoupRestaurant.Factory.Factory;
import S4.SoupRestaurant.Classes.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory(200, 12);
        Soup soup1 = factory.getSoup(SoupTypes.VEGETABLES, "Onions, potatoes, tomatoes", 100);
        soup1.soupPreparation();

        Soup soup2 = factory.getSoup(SoupTypes.VEAL, "Onions, potatoes, tomatoes", 100);
        soup2.soupPreparation();

        Soup soup3 = factory.getSoup(SoupTypes.MUSHROOM, "Onions, mushrooms, sourcream", 100);
        soup3.soupPreparation();

    }
}
