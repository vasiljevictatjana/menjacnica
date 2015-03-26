package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsmenjacnice.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Kurs> kursevi = 
			new LinkedList<Kurs>();

	public void dodajKurs(Kurs kurs) {
		if(kurs.getDatumKursa().before(new GregorianCalendar(GregorianCalendar.YEAR, GregorianCalendar.MONTH, GregorianCalendar.DAY_OF_MONTH)))
			throw new RuntimeException("Datum ne sme biti u proslosti!");
		
		kursevi.add(kurs);
	}

	public void obrisiKurs(Kurs kurs) {
		
	}

	public LinkedList<Kurs> pronadjiKurs(GregorianCalendar datumKursa,
			double prodajniKurs, double kupovniKurs, double srednjiKurs,
			Valuta valuta) {
		
		return null;
	}

}
