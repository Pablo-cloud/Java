//Pablo Ender, 17.01.2020

import java.util.ArrayList;
import java.io.*;

public class StarteAdressbuch{
	
	public static void main(String[] args) {
		
		
		String vorname, name, telefonnummer;
		Adressbuch adressbuch = new Adressbuch();
		Benutzereingabe eingabe = new Benutzereingabe();
		
		
		File meineDatei = new File("TestText.txt");
		
		try (BufferedReader reader = new BufferedReader(new FileReader(meineDatei))) {
		    String line;
		    while ((line = reader.readLine()) != null) {
			   String [] zerhackt = line.split(";");
			   int länge = zerhackt.length;
				   for (int i=0; i<länge;i+=3){
					   vorname = zerhackt[i];
					   name = zerhackt[i+1];
					   telefonnummer = zerhackt[i+2];
					   Kontakte kontaktHinzu = new Kontakte(vorname,name,telefonnummer);
					   adressbuch.kontaktHinzufuegen(kontaktHinzu);
			   }
			   
		    }
		} catch (Exception ex){
			System.out.println("Keine Datenbank die geladen werden kann.");
		}
		
		boolean ende = false;
		while(!ende) {
		String entscheidungsText = eingabe.getBenutzereingabe("Was wollen sie machen?");
		
		if (entscheidungsText.equalsIgnoreCase("liste")) {
			adressbuch.alleKontakte();
			System.out.println();
		}
		if (entscheidungsText.equalsIgnoreCase("hinzufuegen")){
			vorname = eingabe.getBenutzereingabe("Was ist der Vorname?");
			name	= eingabe.getBenutzereingabe("Was ist der Nachname?");
			telefonnummer = eingabe.getBenutzereingabe("Was ist die Telefonnummer?");
			Kontakte kontaktHinzu = new Kontakte(vorname,name,telefonnummer);
			adressbuch.kontaktHinzufuegen(kontaktHinzu);
		}
		if (entscheidungsText.equalsIgnoreCase("entfernen")){
			String index = eingabe.getBenutzereingabe("Welche Person in der Liste wollen sie entfernen? Index eintippen.");
			int ind = Integer.parseInt(index);
			try {
			adressbuch.kontaktEntfernen(ind);
		} catch(Exception e) {
			System.out.println("Dieses Element existiert im Array nicht.");
		}
		}
		if (entscheidungsText.equalsIgnoreCase("ende")){
			ende=true;
			try { //in textdokument schreiben
			FileWriter fileWriter = new FileWriter(meineDatei);
			BufferedWriter writer = new BufferedWriter(fileWriter);
			for (int i=0;i<adressbuch.getSize();i++){
				Kontakte kontakt = adressbuch.getKontakt(i);
				vorname = kontakt.getVorname();
				name = kontakt.getNachname();
				telefonnummer = kontakt.getTelefonnummer();
				writer.write(vorname+";"+name+";"+telefonnummer+";");
				writer.newLine();
			}
			writer.flush(); //schreiben
		}catch (Exception e){ //ausnahmen catchen
			e.printStackTrace();
		}
		}
		} //ende while(!ende)
		
		
}//ende hauptmethode
}//ende Klasse

