import Classes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Handler troleibuz = new HandlerTroleibuz();
        Handler autobuz = new HandlerAutobuz();
        Handler tramvai =  new HandlerTramvai();
        Handler metrou = new HandlerMetrou();

        troleibuz.setUrmator(autobuz);
        autobuz.setUrmator(tramvai);
        tramvai.setUrmator(metrou);

        troleibuz.gestioneazaCerere(2);
        troleibuz.gestioneazaCerere(4);
        troleibuz.gestioneazaCerere(7);
        troleibuz.gestioneazaCerere(13);
    }
}