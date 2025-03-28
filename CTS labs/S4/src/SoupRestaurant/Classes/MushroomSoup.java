package SoupRestaurant.Classes;

public class MushroomSoup extends Soup {
    private int mushroomQuant;

    public MushroomSoup(int quantity, double price, String ingredients, int mushroomQuant) {
        super(quantity, price, ingredients);
        this.mushroomQuant = mushroomQuant;
    }

    @Override
    public void soupPreparation() {
        System.out.println("Here is your mushroom soup! ");
    }

    @Override
    public double priceCalc() {
        return (this.mushroomQuant + this.quantity)/100 * this.price;
    }
}
