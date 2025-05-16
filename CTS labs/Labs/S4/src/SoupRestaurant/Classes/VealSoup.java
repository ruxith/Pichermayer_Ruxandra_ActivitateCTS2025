package SoupRestaurant.Classes;

public class VealSoup extends Soup {
    private double sourPrice;

    public VealSoup(int quantity, double price, String ingredients, double sourPrice) {
        super(quantity, price, ingredients);
        this.sourPrice = sourPrice;
    }

    @Override
    public void soupPreparation() {
        System.out.println("Here is your veal soup! ");
    }

    @Override
    public double priceCalc() {
        return super.priceCalc() + sourPrice;
    }
}
