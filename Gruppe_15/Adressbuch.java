//pablo ender, 17.01.2020


import java.util.ArrayList; //importieren für ArrayList


public class Adressbuch{
	
	ArrayList<Kontakte> adressBuch = new ArrayList<Kontakte>(); //ArrayList erstellen
	
	public int getSize(){ //die methode habe ich für aufgabe e.) gebraucht, und für aufgabe e.) erstellt. Vielleicht wäre es auch anders gegangen, aber so funktionierts.
		int laenge = adressBuch.size();
		return laenge;
	}
	
	public Kontakte getKontakt(int i){ //die methode habe ich für aufgabe e.) gebraucht, und zusätzlich erstellt. Vielleicht wäre es auch anders gegangen, aber so funktionierts.
		Kontakte kontakt = adressBuch.get(i);
		return kontakt;
	}
	
	public void kontaktHinzufuegen(Kontakte einKontakt){ //neues Objekt rein
		adressBuch.add(einKontakt);
	}
	
	public void kontaktEntfernen(int index){ //Index weil Aufgabenstellung
		adressBuch.remove(index);
	}
	public void alleKontakte(){
	for (int i=0;i<adressBuch.size();i++){
		Kontakte kontakt = adressBuch.get(i);
		String vorname = kontakt.getVorname();
		String nachname = kontakt.getNachname();
		String telefonnummer = kontakt.getTelefonnummer();
		System.out.println(i+" "+vorname+" "+nachname+" hat die Telefonnummer "+" "+ telefonnummer+".");
	}
	}
}
