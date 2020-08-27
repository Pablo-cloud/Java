// Pablo Ender, Maximilian Rallis
// 1.) If Verzweigungen und While-Schleifen


public class IfWhile { //deklarieren der Klasse IfWhile

			public static void main (String[] args) {

				int x = 0 ; //Laufvariable auf 0 setzen
						while (x<10){ //Whilebedingungen deklarieren, in diesem Fall das Maximum der Laufvariablen
							x++ ; //Laufvariable pro Durchlauf
					if ((x==2)||(x==3)||(x==5)||(x==7)){ //Bedingunge für Primzahl definieren
     			System.out.print ("Die Zahl " + x);
				System.out.println (" ist eine Primzahl.");
			} // Ende If Bedingung
			else { //Für den Fall das e snicht die Bedingung (Primzahl) erfüllt, diese Aktion durchführen
				System.out.print("Die Zahl " +x);
				System.out.println(" ist keine Primzahl.");
			}
		}//Ende der While Schleife	
	
	}//Ende der Methode

}//Ende Klasse