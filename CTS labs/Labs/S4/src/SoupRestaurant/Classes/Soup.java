package SoupRestaurant.Classes;

public abstract class Soup {
    protected int quantity;
    protected double price;
    protected String ingredients;

    public abstract void soupPreparation();

    public double priceCalc(){
        return quantity/100 * price;
    }

    public Soup(int quantity, double price, String ingredients) {
        this.quantity = quantity;
        this.price = price;
        this.ingredients = ingredients;
    }
}
