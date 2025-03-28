package SoupRestaurant.Classes;

public class VeggieSoup extends Soup {
    private double croutonsGram;

    public VeggieSoup(int quantity, double price, String ingredients, double croutonsGram) {
        super(quantity, price, ingredients);
    }

    @Override
    public void soupPreparation() {
        System.out.println("Here is your veggie soup! ");
    }

    @Override
    public double priceCalc() {
        return super.priceCalc() + croutonsGram/100 * price/2;
    }
}
