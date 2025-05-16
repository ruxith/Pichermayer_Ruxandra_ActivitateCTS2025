package Decorator.Classes;

public abstract class NotaDecorata implements Nota{

    private Nota nota;

    public NotaDecorata(Nota nota) {
        this.nota = nota;
    }

    public String printare() {
        return nota.printare() + printareFelicitare();
    }
    protected abstract String printareFelicitare();

}
