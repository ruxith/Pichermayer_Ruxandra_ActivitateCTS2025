package Classes;

public class HandlerSMS extends Handler {

    public HandlerSMS() {
    }

    public HandlerSMS(Handler urmatorulHandler) {
        super(urmatorulHandler);
    }

    @Override
    public void notificaClient(Client client, String notificare) {
        if(client.getNrTelefon() != null){
            System.out.println("Trimite SMS catre clientul: " + client.getNume());
            System.out.println(notificare);
        } else {
            super.getUrmatorulHandler().notificaClient(client, notificare);
        }
    }
}
