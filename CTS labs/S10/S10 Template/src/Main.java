import Classes.AMetrou;
import Classes.Metrou;
import Classes.MetrouSpecial;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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