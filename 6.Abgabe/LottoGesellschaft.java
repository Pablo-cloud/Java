/**
 * Zieht Gewinnzahlen und prueft Anzahl der Treffer in einem Tipp
 */
import java.util.Arrays;
import java.util.ArrayList;

public class LottoGesellschaft {

	// Array fuer Gewinnzahlen
	private int[] gewinnzahlen = new int[6];
	int anzahlTreffer; // fuer Methode getAnzahlTreffer
	// Getter
	public int[] getGewinnzahlen() {
		return gewinnzahlen;
	}

	// Setter: 6 zufaellige Zahlen ziehen anstatt einen Parameter anzunehmen
	public void zieheGewinnzahlen() {
		for (int zahl = 0; zahl < 6; zahl++) {
			gewinnzahlen[zahl] = (int) (Math.random() * 49) + 1;
		}
		Arrays.sort(gewinnzahlen);
	}
	public int getAnzahlTreffer(int[] lottoTipp, int[]lottoErgebnis){
		anzahlTreffer = 0;
		for (int a:lottoTipp){
			for (int b:lottoErgebnis){
				if(a==b){
					anzahlTreffer++;
				}
			}
		}
		return anzahlTreffer;
	}	
	//fuer Aufgabe 2.b
	public boolean pruefeWertebereich(int[] bereich){
		boolean gueltigkeit = false;
		for (int blubb : bereich){ // verbesserte for schleife setzt blubb immer auf den aktuellen wert des arrays
			if (blubb>=1&& blubb<=49){ // verschachtelte ifschleife, um den Wertebereich zu überprüfen
				gueltigkeit = true; //wenn alle Zahlen im Array im Werte Bereich liegen, wird der booleansche Wert gültigkeit auf True gesetzt, andererseits auf false
			} else {
				gueltigkeit = false;
			}
		}
		return gueltigkeit;
	}
}
