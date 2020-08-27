/**
 * Die Klasse Erdmaennchen erbt von Tier
 */
public final class Erdmaennchen extends Tier implements Fleischfresser {

	public void knochenZerbeissen() {
		System.out.println("Ich habe meiner Art gerecht verdaut!");
	}

  // Methode aus Tier ueberschrieben
  public void erzaehlWas() {
    // Das Gleiche was jedes Tier sagt.
    super.erzaehlWas();

    // Zusaetzliche Aussage des Erdmaennchen
    System.out.println("Gaenge graben - schnell hier gehen Hyaenen um!");
  }

  // Methode aus Tier ueberschrieben
  public void geraeuschMachen() {
    // Erdmaennchen nutzen Ultraschall
    System.out.println("...");
  }

  // Diese Methode ist ueberladen, weil die Menge und Art der Parameter geaendert wurde
  public void initialisieren(String neuerName, int neuesAlter, float neuesGewicht, String neuesUrsprungsland, boolean neuGefaehrlich) {
    // deshalb kann man hier auch ohne super arbeiten
    initialisieren("Erdmaennchen", neuerName, neuesAlter, neuesGewicht, neuesUrsprungsland, neuGefaehrlich);
  }
}
