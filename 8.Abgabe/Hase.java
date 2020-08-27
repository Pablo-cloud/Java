/**
 * Die Klasse Hase erbt von Tier
 */
public final class Hase extends Tier implements Pflanzenfresser {

	public void pflanzenZerkauen() {
		System.out.println("Ich habe meiner Art gerecht verdaut!");
	}
  // Methode aus Tier ueberschrieben
  public void erzaehlWas() {
    // Das Gleiche was jedes Tier sagt.
    super.erzaehlWas();

    // Zusaetzliche Aussage des Hasen
    System.out.println("Ich will eine Karotte...");
  }

  // Methode aus Tier ueberschrieben
  public void geraeuschMachen() {
    System.out.println("MÜMMEL");
  }

  // Diese Methode ist ueberladen, weil die Menge und Art der Parameter geaendert wurde
  public void initialisieren(String neuerName, int neuesAlter, float neuesGewicht, String neuesUrsprungsland, boolean neuGefaehrlich) {
    // deshalb kann man hier auch ohne super arbeiten
    initialisieren("Hase", neuerName, neuesAlter, neuesGewicht, neuesUrsprungsland, neuGefaehrlich);
  }
}
