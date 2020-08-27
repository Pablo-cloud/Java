/**
 * In dieser Klasse muessen Dinge geaendert werden
 */
import java.util.Random;

public final class B787 extends Boeing {

  // Konstruktoren
  public B787 () {
    super("B787");
  }

  public void abheben() {
    System.out.println("Eine B787 hebt ab.");
  }

  public void fliegen() throws Exception, LeiderKaputt, KeinBenzinMehr {
    //-------Anfang-------
	if (kaputt) {
		System.out.println("Die B787 ist leider kaputt und muss repariert werden!");
		throw new LeiderKaputt();
	} else {
	}
	if (tankFuellung == 0) {
		System.out.println("Der Tank ist leer!");
		throw new KeinBenzinMehr();
	} else {
		}
	

    //--------Ende--------

    if (tankFuellung > 0 && !kaputt) {
      System.out.println("Eine B787 fliegt.");

      // Der Tank leert sich langsam
      tankFuellung--;

      // Das Flugzeug geht zufaellig kaputt
      Random random = new Random();
      kaputt = random.nextBoolean();
    } else {
      System.out.println("Eine B787 IST ABGESTUERZT.");
      throw new Exception();
    }
  }

  public void landen() {
    System.out.println("Eine B787 landet.");
  }

  // Der Tank von Flugzeugen ist unterschiedlich gross
  public void tanken() {
    tankFuellung = tankFuellung + 3;
    System.out.println("Eine B787 tankt.");
  }
}
