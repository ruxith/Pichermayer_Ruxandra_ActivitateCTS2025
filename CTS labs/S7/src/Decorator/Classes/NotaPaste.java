package Decorator.Classes;

public class NotaPaste extends NotaDecorata{

    public NotaPaste(Nota nota) {
        super(nota);
    }

    @Override
    protected String printareFelicitare() {
        return "\nPaste fericit!";
    }
}