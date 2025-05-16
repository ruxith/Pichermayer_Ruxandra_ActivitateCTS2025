package Decorator.Classes;

public class NotaCraciun extends NotaDecorata{

    public NotaCraciun(Nota nota) {
        super(nota);
    }

    @Override
    protected String printareFelicitare() {
        return "\nCraciun fericit!";
    }
}