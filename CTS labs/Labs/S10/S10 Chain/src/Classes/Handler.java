package Classes;

public abstract class Handler {
    protected Handler urmator;

    public Handler(Handler urmator) {
        this.urmator = urmator;
    }

    public Handler() {
    }

    public void setUrmator(Handler urmator) {
        this.urmator = urmator;
    }

    public abstract void gestioneazaCerere(int distanta);
}
