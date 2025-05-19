public class PlataCash implements ModPlata{

    @Override
    public void plateste(String numeClient, double Suma, double SoldCurent) {
        System.out.println(numeClient + " plateste cash suma de " +  Suma);
        System.out.println("Are de primit rest: " + (SoldCurent - Suma) + " lei");
    }
}
