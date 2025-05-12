package Decorator.Classes;

public class NotaDePlata implements Nota {
    private float suma;

    public NotaDePlata(float suma) {
        this.suma = suma;
    }

    public float getSuma() {
        return suma;
    }

    @Override
    public String printare() {
        return "Aveti de achitat suma: " + getSuma();
    }
}
