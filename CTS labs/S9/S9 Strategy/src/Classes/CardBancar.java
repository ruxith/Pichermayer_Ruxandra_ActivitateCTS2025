package Classes;

public class CardBancar implements IMetodaPlata{
    float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float pretBilet) {
        if(sold - pretBilet >= 0){
            sold -= pretBilet;
            System.out.println("Multumim pentru calatorie.");
        } else{
            System.out.println("Sold insuficient.");
        }
    }
}
