/**
 * In dieser Klasse muessen Dinge geaendert werden
 */
public class FlugzeugTest {

  public static void main(String[] args) {
    Flugzeug[] flugzeuge = new Flugzeug[3];
    flugzeuge[0] = new ModellFlugzeug();
    flugzeuge[1] = new B787();
    flugzeuge[2] = new A380();
	//Werkstatt.flugzeugReparieren(flugzeuge[0]);
	//Werkstatt.flugzeugTanken(flugzeuge[0]); // Zu Testzwecken
	//Werkstatt.flugzeugTanken(flugzeuge[0]);
	
	
    // Alle Flugzeuge fliegen 10 mal
    for (int i = 0; i < 10; i++) {
      for (Flugzeug einFlieger : flugzeuge) {
        //-------Anfang-------
        // Zwischen Anfang und Ende darf der Code so
        // geaendert werden, dass die Aufgabenstellung erfuellt wird
        try {
          einFlieger.abheben();
          einFlieger.fliegen();
          einFlieger.landen();
		//} catch(LeiderKaputt l){ //catch die LeiderKaputt Ausnahnme
		//	Werkstatt.flugzeugReparieren(einFlieger); //wenn Kaputt dann das Objekt in dem Array von der Werkstatt reparieren lassen
		//} catch(KeinBenzinMehr k){ //catch, wenn der Tank leer ist
		//	Werkstatt.flugzeugTanken(einFlieger); //wenn Tank Leer, dann von der Werkstatt betanken lassen
		} catch(Exception e){ //Übrigbleibsel, um zu checken ob man noch eine Ausnahme vergessen hat
          // Dieser Code hilft dabei noch Stellen zu finden die geaendert werden muessen
          // Man darf ihn aendern - aber auf eigene Gefahr ;-)
          System.out.println("Informationen zum Absturz:");
          e.printStackTrace();
          // Sobald ein Flugzeug abgestuerzt ist wird hier das Programm direkt beendet
          System.exit(0);
        }
        //--------Ende--------
      }
    }

  }
}
