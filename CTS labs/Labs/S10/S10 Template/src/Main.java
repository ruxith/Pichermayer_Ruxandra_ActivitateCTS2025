import Classes.AMetrou;
import Classes.Metrou;
import Classes.MetrouSpecial;

public class Main {
    public static void main(String[] args) {
        AMetrou metrou = new Metrou(15);
        AMetrou metrouS = new MetrouSpecial();

        metrouS.circulaRetur();
        metrouS.circulaTur();

        metrou.circulaTur();
        metrou.circulaRetur();
    }
}