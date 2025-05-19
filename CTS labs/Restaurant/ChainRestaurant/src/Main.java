import Classes.*;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Ion Popescu", "ion.popescu@email.com", "0712345678");
        Client client2 = new Client("Maria Ionescu", null, "0723456789");
        Client client3 = new Client("George Vasile", "george.vasile@email.com", null);
        Client client4 = new Client("David Georgescu", null, null);

        Handler handlerSMS = new HandlerSMS();
        Handler handlerEmail = new HandlerEmail();
        Handler handlerNone = new HandlerNone();

        handlerSMS.setUrmatorulHandler(handlerEmail);
        handlerEmail.setUrmatorulHandler(handlerNone);

        handlerSMS.notificaClient(client1, "Ai o reducere!");
        System.out.println("-----------------");

        handlerSMS.notificaClient(client2, "Ai o reducere!");
        System.out.println("-----------------");

        handlerSMS.notificaClient(client3, "Ai o reducere!");
        System.out.println("-----------------");

        handlerSMS.notificaClient(client4, "Ai o reducere!");


    }
}