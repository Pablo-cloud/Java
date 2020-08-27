/**
 * DIESE DATEI NICHT AENDERN
 */
public abstract class VerkehrsFlugzeug extends Flugzeug implements KannTanken {

  private int anzahlPassagiere;
  // Diese Instanzvariable hat keinen Setter und Getter
  // und ist protected um in Unterklassen verwendet zu werden
  protected int tankFuellung;

  public VerkehrsFlugzeug(String einTyp) {
    super(einTyp);
  }

  // Getter/Setter
  public void setAnzahlPassagiere(int anzahl) {
    anzahlPassagiere = anzahl;
  }

  public int getAnzahlPassagiere() {
    return anzahlPassagiere;
  }

  public void abheben() {
    System.out.println("Ein VerkehrsFlugzeug hebt ab.");
  }
}
