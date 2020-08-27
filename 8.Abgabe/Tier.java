/**
 * Superklasse fuer alle Tiere
 */
abstract public class Tier {

  // Instanzvariablen die fuer alle Tiere gelten
  private String nameTierart;
  private String name;
  private int alter;
  private float gewicht;
  private String ursprungsland;
  private boolean gefaehrlich;

  // Getter und Setter der jeweiligen privaten Instanzvariablen
  public void setNameTierart(String neuNameTierart) {
    if (neuNameTierart.equals("")) {
      neuNameTierart = "unbekannt";
    }

    nameTierart = neuNameTierart;
  }

  public String getNameTierart() {
    return nameTierart;
  }

  public void setName(String neuerName) {
    if (neuerName.equals("")) {
      neuerName = "unbekannt";
    }

    name = neuerName;
  }

  public String getName() {
    return name;
  }

  public void setAlter(int neuesAlter) {
    if (neuesAlter < 0) {
      neuesAlter = 0;
    }
    else if (neuesAlter > 200) {
      neuesAlter = 200;
    }
    alter = neuesAlter;
  }

  public int getAlter() {
    return alter;
  }

  public void setGewicht(float neuesGewicht) {
    if (neuesGewicht < 0.1f) {
      neuesGewicht = 0.1f;
    }
    else if (neuesGewicht > 1000f) {
      neuesGewicht = 1000f;
    }
    gewicht = neuesGewicht;
  }

  public float getGewicht() {
    return gewicht;
  }

  public void setUrsprungsland(String neuesUrsprungsland) {
    if (neuesUrsprungsland.equals("")) {
      neuesUrsprungsland = "unbekannt";
    }

    ursprungsland = neuesUrsprungsland;
  }

  public String getUrsprungsland() {
    return ursprungsland;
  }

  public void setGefaehrlich(boolean neuGefaehrlich) {
    gefaehrlich = neuGefaehrlich;
  }

  public boolean getGefaehrlich() {
    return gefaehrlich;
  }

  // Jedes Tier erzaehlt etwas
  public void erzaehlWas() {
    System.out.println("Ich bin ein " + nameTierart + ".");
    System.out.println("Ich heisse " + name + ".");
    System.out.println("Mein Alter betraegt " + alter + " Jahre.");
    System.out.println("Mein Gewicht betraegt " + gewicht + "kg.");
    System.out.println("Ich komme aus " + ursprungsland + ".");
    if (gefaehrlich) {
      System.out.println("Bleib weg von mir!");
    }
    else {
      System.out.println("Ich werde gerne gestreichelt.");
    }
  }

  // Jedes Tier macht Geraeusche - aber es gibt kein allgemeines Geraeusch
  public void geraeuschMachen() {
  }

  // Initialisieren aller Instanzvariablen mit den abgesicherten Settern
  protected void initialisieren(String neuNameTierart, String neuerName, int neuesAlter, float neuesGewicht, String neuesUrsprungsland, boolean neuGefaehrlich) {
    setNameTierart(neuNameTierart);
    setName(neuerName);
    setAlter(neuesAlter);
    setGewicht(neuesGewicht);
    setUrsprungsland(neuesUrsprungsland);
    setGefaehrlich(neuGefaehrlich);
  }
}
