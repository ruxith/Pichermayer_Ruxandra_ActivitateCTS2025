import javax.smartcardio.Card;

public class PlataCard implements ModPlata {
    @Override
    public void plateste(String numeClient, double Suma, double SoldCurent) {
        System.out.println(numeClient + " plateste card suma de " +  Suma);
        System.out.println("Sold curent: " + (SoldCurent - Suma) + " lei");
    }
}
