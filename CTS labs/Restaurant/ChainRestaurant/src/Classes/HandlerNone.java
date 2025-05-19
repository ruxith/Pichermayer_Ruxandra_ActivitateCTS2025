package Classes;

public class HandlerNone extends Handler {
    public HandlerNone() {
    }

    public HandlerNone(Handler urmatorulHandler) {
        super(urmatorulHandler);
    }

    @Override
    public void notificaClient(Client client, String notificare) {
        System.out.println("Clientul: " + client.getNume() + " nu are nici nr de telefon nici e-mail inregistrat.");
    }
}
