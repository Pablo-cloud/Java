/**
 * Die Klasse Loewe erbt von Tier
 */
public final class Loewe extends Tier implements Fleischfresser {
	
	public void knochenZerbeissen() {
		System.out.println("Ich habe meiner Art gerecht verdaut!");
	}

  // Methode aus Tier ueberschrieben
  public void erzaehlWas() {
    // Das Gleiche was jedes Tier sagt.
    super.erzaehlWas();

    // Zusaetzliche Aussage des Loewen
    System.out.println("Ich bin der Koenig der Tiere!");
  }

  // Methode aus Tier ueberschrieben
  public void geraeuschMachen() {
    System.out.println("ROAAAR");
  }

  // Diese Methode ist ueberladen, weil die Menge und Art der Parameter geaendert wurde
  public void initialisieren(String neuerName, int neuesAlter, float neuesGewicht, String neuesUrsprungsland, boolean neuGefaehrlich) {
    // deshalb kann man hier auch ohne super arbeiten
    initialisieren("Loewe", neuerName, neuesAlter, neuesGewicht, neuesUrsprungsland, neuGefaehrlich);
  }
}
