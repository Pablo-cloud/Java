 public class Werkstatt {

	public static void flugzeugReparieren(Flugzeug einFlugzeug) { //statische Methode
		einFlugzeug.reparieren();
		System.out.println("Das Flugzeug wurde repariert!");
	}
	
	public static void flugzeugTanken(Flugzeug einFlugzeug) {
		if (einFlugzeug instanceof KannTanken){ //checken, ob das Objekt eine Instanz von KannTanken ist
			KannTanken betankbaresFlugzeug = (KannTanken) einFlugzeug; //Objekt casten, damit das Ding kompiliert
			betankbaresFlugzeug.tanken();
			
			System.out.println("Es wurde getankt.");
		} else {
				System.out.println("Das Flugzeug ist nicht betankbar.");
			}
	}
}