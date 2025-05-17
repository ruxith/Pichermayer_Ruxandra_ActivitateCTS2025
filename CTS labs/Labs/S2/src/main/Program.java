package main;

import Clase.Aplicant;
import Readers.AngajatiReader;
import Readers.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			AplicantReader reader = new AngajatiReader("S1/angajati.txt");
			listaAplicanti = reader.readAplicanti();
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
