public class Main {
    public static void main(String[] args) {
        LinieFactory linieFactory = new LinieFactory();
        Autobuz autobuz = new Autobuz(2012,"Mercedes", 40);
        linieFactory.getLinie(1);
        linieFactory.getLinie(2);
        linieFactory.getLinie(3);

        linieFactory.getLinie(4).descriere(autobuz);
    }
}