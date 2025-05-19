package Classes;

public class HandlerEmail extends Handler {

    public HandlerEmail() {
    }

    public HandlerEmail(Handler urmatorulHandler) {
        super(urmatorulHandler);
    }

    @Override
    public void notificaClient(Client client, String notificare) {
        if(client.getAdresaEmail() != null){
            System.out.println("Trimite e-mail catre clientul: " + client.getNume());
            System.out.println(notificare);
        } else {
            super.getUrmatorulHandler().notificaClient(client, notificare);
        }
    }
}
