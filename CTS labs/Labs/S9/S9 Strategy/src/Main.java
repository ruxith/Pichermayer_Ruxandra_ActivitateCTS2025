import Classes.Calator;
import Classes.CardBancar;
import Classes.CardCalatorie;

public class Main {
    public static void main(String[] args) {
        Calator calator1 = new Calator("Ruxandra", new CardCalatorie(10));

        calator1.platesteCalatorie(5);
        calator1.platesteCalatorie(5);
        calator1.setMetodaPlata(new CardBancar(58.56F));
        calator1.platesteCalatorie(5);


    }
}