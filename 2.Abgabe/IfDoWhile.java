// Pablo Ender, Maximilian Rallis
// 2.) Do-While Schleifen


public class IfDoWhile { //Anfang Klasse
	public static void main (String[] args) { //Anfang Methode
		int x = 0; //Laufvariable auf 0 setzen
		do { // do
			x++; //aktion
			if ((x==2)||(x==3)||(x==5)||(x==7)) // wenn deklarieren
			{
 			System.out.print ("Die Zahl " + x); //wenn Bedingungen erfüllt sind, das hier tun
			System.out.println (" ist eine Primzahl.");
			} else  // ansonsten das hier tun
			{
				System.out.print("Die Zahl " +x);
				System.out.println(" ist keine Primzahl.");
			}
		} while (x<10); // und das ganze durchführen, während x kleiner 10 ist.
}	//Ende Methode
} //Ende Klasse