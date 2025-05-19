public class Main {
    public static void main(String[] args) throws Exception {
        ComponentaFlota autobuz1 = new Autobuz("Mercedes", "Citaro", 10);
        ComponentaFlota autobuz2 = new Autobuz("Volvo", "7900", 30);
        ComponentaFlota autobuz3 = new Autobuz("MAN", "Lion's City", 50);

        GrupAuto grupMici = new GrupAuto("Autobuze Mici (10 locuri)");
        grupMici.addNod(autobuz1);

        GrupAuto grupMedii = new GrupAuto("Autobuze Medii (30 locuri)");
        grupMedii.addNod(autobuz2);

        GrupAuto grupMari = new GrupAuto("Autobuze Mari (50 locuri)");
        grupMari.addNod(autobuz3);

        GrupAuto flota = new GrupAuto("Flota de Autobuze");
        flota.addNod(grupMici);
        flota.addNod(grupMedii);
        flota.addNod(grupMari);
        
        flota.getInfo("");
    }
}