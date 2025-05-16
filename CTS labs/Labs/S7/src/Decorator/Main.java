package Decorator;

import Clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Nota nota = new NotaDePlata(150);
        System.out.println(nota.printare());

        NotaDecorata notaDecorata = new NotaAnNou(nota);
        System.out.println(notaDecorata.printare());

        Nota notaCraciun = new NotaCraciun(notaDecorata);
        System.out.println(notaCraciun.printare());
    }
}