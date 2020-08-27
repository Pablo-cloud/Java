/**
 * DIESE DATEI NICHT AENDERN
 */
public abstract class Airbus extends VerkehrsFlugzeug {

  public Airbus(String einTyp) {
    super(einTyp);
  }

  // Getter/Setter
  public void abheben() {
    System.out.println("Ein Airbus hebt ab.");
  }

  public void landen() {
    System.out.println("Ein Airbus landet.");
  }
}
