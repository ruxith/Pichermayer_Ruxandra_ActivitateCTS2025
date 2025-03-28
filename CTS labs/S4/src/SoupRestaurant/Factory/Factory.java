package SoupRestaurant.Factory;

import S4.SoupRestaurant.Classes.*;

public class Factory {
    private int grams;
    private double price;

    public Factory(int grams, double price) {
        this.grams = grams;
        this.price = price;
    }

    public Soup getSoup(SoupTypes soup, String ingredients, double extraParam){
        switch (soup){
            case VEGETABLES:
                VeggieSoup veggieSoup = new VeggieSoup(grams, price, ingredients, extraParam);
                return veggieSoup;
            case VEAL:
                VealSoup vealSoup = new VealSoup(grams, price, ingredients, extraParam);
                return vealSoup;
            case MUSHROOM:
                MushroomSoup mushSoup = new MushroomSoup(grams, price, ingredients, (int)extraParam);
                return mushSoup;
        }
        return null;
    }
}
