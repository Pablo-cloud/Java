/**
 * DIESE DATEI NICHT AENDERN
 */
public abstract class Flugzeug {

  private String typ;
  // Diese Instanzvariable hat keinen Setter und Getter
  // und ist protected um in Unterklassen verwendet zu werden
  protected boolean kaputt;

  public Flugzeug(String einTyp) {
    typ = einTyp;
    // Jedes Flugzeug ist am Anfang kaputt
    kaputt = true;
  }

  // Getter/Setter
  public void setTyp(String einTyp) {
    typ = einTyp;
  }

  public String getTyp() {
    return typ;
  }

  public void abheben() {
    System.out.println("Ein Flugzeug hebt ab.");
  }

  public abstract void fliegen() throws Exception;

  public void landen() {
    System.out.println("Ein Flugzeug landet.");
  }

  // Jedes Flugzeug kann repariert werden
  public void reparieren() {
    kaputt = false;
  }
}
