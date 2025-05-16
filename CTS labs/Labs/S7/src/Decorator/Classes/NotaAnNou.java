package Decorator.Classes;

public class NotaAnNou extends NotaDecorata{

    public NotaAnNou(Nota nota) {
        super(nota);
    }

    @Override
    protected String printareFelicitare() {
        return "\nLa multi ani!";
    }
}
