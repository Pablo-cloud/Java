/**
 * In dieser Klasse muessen Dinge geaendert werden
 */
import java.util.Random;

public final class A380 extends Airbus {

  // Konstruktoren
  public A380 () {
    super("A380");
  }

  // Getter/Setter
  public void abheben() {
    System.out.println ("Eine A380 hebt ab.");
  }

  public void fliegen() throws Exception, LeiderKaputt, KeinBenzinMehr {
    //-------Anfang-------
	if (kaputt) { //wenn Kaputt dann die LeiderKaputt Ausnahme werfen
		System.out.println("Die A380 ist leider kaputt und muss repariert werden!");
		throw new LeiderKaputt();
	} else {
	}
	if (tankFuellung == 0) { //wenn die Tankfuellung 0 ist, dann die KeinBenzinMehr Methode werfen
		System.out.println("Der Tank ist leer!");
		throw new KeinBenzinMehr();
	} else {
		}
	
    //--------Ende--------

    if (tankFuellung > 0 && !kaputt) {
      System.out.println("Eine A380 fliegt.");

      // Der Tank leert sich langsam
      tankFuellung--;

      // Das Flugzeug geht zufaellig kaputt
      Random random = new Random();
      kaputt = random.nextBoolean();
    } else {
      System.out.println("Eine A380 IST ABGESTUERZT.");
      throw new Exception();
    }
  }

  public void landen() {
    System.out.println ("Ein A380 landet.");
  }

  // Der Tank von Flugzeugen ist unterschiedlich gross
  public void tanken() {
    tankFuellung = tankFuellung + 4;
    System.out.println ("Eine A380 tankt.");
  }
}
