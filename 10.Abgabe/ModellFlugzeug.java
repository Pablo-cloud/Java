/**
 * In dieser Klasse muessen Dinge geaendert werden
 */
import java.util.Random;

public class ModellFlugzeug extends Flugzeug {

  public ModellFlugzeug() {
    super("Modell");
  }

  public void abheben() {
    System.out.println("Ein ModellFlugzeug hebt ab.");
  }

  public void fliegen() throws Exception, LeiderKaputt {
    //-------Anfang-------
	if (kaputt) {
		System.out.println("Das Modellflugzeug ist am Arsch.");
		throw new LeiderKaputt();
	}else {
	}

    //--------Ende--------

    if (kaputt) {
      System.out.println("Ein ModellFlugzeug IST ABGESTUERZT.");
      throw new Exception();
    } else {
      System.out.println("Ein ModellFlugzeug fliegt.");

      // Das Flugzeug geht zufaellig kaputt
      Random random = new Random();
      kaputt = random.nextBoolean();
    }
  }

  public void landen() {
    System.out.println("Ein ModellFlugzeug landet.");
  }
}
