//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package main;

import java.util.ArrayList;
import java.util.List;
import interfete.IPredabil;
import modele.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<Student>();
        studenti.add(new Student("Mihaela", 22, 1));
        studenti.add(new Student("Ioana", 21, 2));
        studenti.add(new Student("Rares", 22, 3));

        Curs curs = new Curs("CTS", 5, (IPredabil) new Profesor("Alin Zamfiroiu", 40, 1, 6000, 0.2F), studenti);

        System.out.println("VENITUL PROFESORULUI "+ ((Persoana)curs.getCadruDidactic()).getNume()
                +" LA CURSUL "+curs.getNumeCurs()+": "+
                String.valueOf(((Persoana)curs.getCadruDidactic()).calculeazaVenit())+ " RON");

        curs.afisareDetalii();
        curs.sustineExamene("10 iunie 2025");

        ((IPredabil)curs.getCadruDidactic()).preda();

        Asistent asistent = new Asistent("Asistent", 35, 1, 4000);
        curs.setCadruDidactic(asistent);


        curs.sustineExamene("06 iulie 2025");

    }
}