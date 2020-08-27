// Testcode fuer c) der angepasst und erweitert werden muss
import java.util.ArrayList;

class LottoSpiel {
	public static void main (String[] args) {

		// Objekte erzeugen
		LottoGesellschaft 	superDuperLotto = new LottoGesellschaft();
		Benutzereingabe 	eingabe 		= new Benutzereingabe();
		String 				name; //fuer die Benutzereingabe
		boolean 			spieli 			= true; //boolean damit schleife funktioniert
		int 				anzahlGewinner	= 0;
		
		int[] gewinnzahlen = new int[6];	// Array fuer Gewinnzahlen
		
		// Testcode fuer c) der angepasst und erweitert werden muss
		ArrayList<LottoTipp> alleTipps = new ArrayList<LottoTipp>();	// ArrayList fuer viele Spieler
		//Platz im Command Window schaffen
		System.out.println();
		System.out.println();
		
		//Start mit Aufgabe 2.b
		
		while(spieli=true){
			LottoTipp tipp = new LottoTipp(); //Array fuer Tipps
			int [] lottoZahlen = new int[6]; //groeße des Arrays 
			
			name = eingabe.getBenutzereingabe("Was ist der Name des Spielers?"); // name von Spieler abfragen
				tipp.setName(name); // in Array setten
	        for (int zahl = 0; zahl < 6; zahl++) {
	            lottoZahlen[zahl] = Integer.parseInt(eingabe.getBenutzereingabe("Geben Sie Ihre " + (zahl + 1) + ". Zahl ein:"));
	        }
			
			if (tipp.pruefeWerteBereich(lottoZahlen)==true){ //pruefen ob Eingabe korrekt
				tipp.setTipp(lottoZahlen); //Array mit lottozahlen vollknallen
				alleTipps.add(tipp); //Array in Arraylist packen
			}
			else {
				System.out.println("Dein Tipp ist ungültig. Die Zahlen muesssen zwischen 1 und 49 liegen.");
			}
			
			
			String weiterspielen = eingabe.getBenutzereingabe("Gibt es weitere Spieler? j/n");
			if (weiterspielen.equals("j")){
			} else {
				break;
			}
		}
		
		// Platz mache
		System.out.println();
		System.out.println();
		
		// Tipps ausgeben
		System.out.println("Es spielen insgesamt " + alleTipps.size() + " Spieler Lotto.");

		for (int x=0; x<alleTipps.size();){
			LottoTipp 	ausgabeTipp = alleTipps.get(x);
			String		spielerName = ausgabeTipp.getName();
			int []		ausgabeZahlen = ausgabeTipp.getTipp();
			System.out.print (spielerName + " tippt auf die Zahlen:");
			
			for (int zahlen : ausgabeZahlen) {
				System.out.print(zahlen + " ");
			}
			System.out.println();
			x++;
		}
		// Gewinnzahlen ziehen
		
        System.out.print ("Folgende Gewinnzahlen wurden gezogen: ");
        superDuperLotto.zieheGewinnzahlen();
        gewinnzahlen = superDuperLotto.getGewinnzahlen();
         
        for (int zahl: gewinnzahlen) {
            System.out.print(zahl + " ");
        }
        System.out.println();
     
	 	//Gewinner ermitteln
	 
		for (int z=0; z<alleTipps.size();){
			LottoTipp 	ausgabeTipp = 	alleTipps.get(z);
			String 		gewinnerName = 	ausgabeTipp.getName();
			int []		ausgabeZahlen = ausgabeTipp.getTipp();
			
			if(superDuperLotto.getAnzahlTreffer(ausgabeZahlen,gewinnzahlen) >=3){ //Wenn mehr oder gleich 3, erfüllt
				System.out.println(gewinnerName + " gewinnt mit " + superDuperLotto.getAnzahlTreffer(ausgabeZahlen, gewinnzahlen)+ " richtigen Zahlen.");
				anzahlGewinner++; // fuer spaetere Ausgabe
			}
			z++;
		}
	 	if (anzahlGewinner>0){
	 		System.out.println("Insgesamt haben "+ anzahlGewinner + " im Lotto gewonnen.Hurra!"); //Anzahl Gewinner ausgeben
	 	}
		else {
			System.out.println("Für einen Gewinn müssen mindestens 3 Zahlen richtig getippt sein.Es gibt leider keine Gewinner. Viel Glück beim nächsten mal!"); // falls keine Gewinner, ausgeben
		}
		System.out.println();
	}
}