/**
 * Speichert einen Tipp und den Namen des Spielers
 */

import java.util.Arrays;

public class LottoTipp {

	// Array fuer Lottozahlen
	private int[] tipp = new int[6];
	private String name;

	// Setter
	public void setTipp (int[] numbers) {
		tipp = numbers;
		Arrays.sort(tipp);
	}

	// Getter
	public int[] getTipp () {
		return tipp;
	}
	public void setName (String spieler) {
		name = spieler;
	}

	public String getName () {
		return name;
	}
	public boolean pruefeWerteBereich (int[] tippBereich){
		boolean gueltigkeit = true;
		for (int a : tippBereich){
			if(a>=50 || a<=0){
				gueltigkeit = false;}
			}
			return gueltigkeit;
		}
	
}
