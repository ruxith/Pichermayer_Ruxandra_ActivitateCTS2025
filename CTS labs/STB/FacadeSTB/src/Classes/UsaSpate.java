package Classes;

public class UsaSpate implements IUsa {
    @Override
    public void deschidereLiberUsa() {
        System.out.println("Usa spate deschisa la liber.");
    }

    @Override
    public void deschidereFortataUsa() {
        System.out.println("Deschidere fortata usa din spate");
    }
}
