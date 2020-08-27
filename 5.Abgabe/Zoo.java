public class Zoo {

	public void losGehts() {
		
		Affe a = new Affe ();		//Tier Objekt Affe erstellen
			a.setName("Charly"); //inizialisieren des Tieres
			a.setLand("Madagaskar");
			a.setFarbe("Schwarz");
			a.setAlter(8);
			a.setGroesse(2);
			a.setGewicht(45);
			
			
		Loewe l = new Loewe();
			l.setName("Simba");
			l.setLand("Suedafrika");
			l.setFarbe("Schwarz Gold gestreift");
			l.setAlter(8);
			l.setGroesse(2);
			l.setGewicht(55);
		

			Benutzereingabe eingabe = new Benutzereingabe();						//Objekt erstellen
			String gesucht = eingabe.getBenutzereingabe("Wähle Dir ein Tier aus! "); //Ausgabe in Konsole
			
			boolean enter = gesucht.equals("ENDE"); //enter = wahr, wenn "ENDE
			
			
				while (!enter){ 					//starte while schleife
					if(gesucht.equals("Affe")){		//wenn Eingabe = Affe
							a.erzaehlWas();			//rufe Methode auf 
				
					}
					if(gesucht.equals("Loewe")){
							l.erzaehlWas();
					}
					System.out.println(" ");
					gesucht = eingabe.getBenutzereingabe("Wähle Dir ein Tier aus! "); 
					//enter = gesucht.equals("ENDE"); 	//alternativer weg
					if(gesucht.equals("ENDE")){			//wenn Eingabe = ENDE, verlasse die Schleife
						System.out.print("Bis zum naechsten mal");	
						return;
					}
				}
			System.out.print("Bis zum naechsten mal ");
	}
}