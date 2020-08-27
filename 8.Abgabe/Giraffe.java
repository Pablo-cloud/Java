/**
 * Die Klasse Giraffe erbt von Tier
 */
public final class Giraffe extends Tier implements Pflanzenfresser   {
	
	public void pflanzenZerkauen() {
		System.out.println("Ich habe meiner Art gerecht verdaut!");
	}

  // Methode aus Tier ueberschrieben
  public void erzaehlWas() {
    // Das Gleiche was jedes Tier sagt.
    super.erzaehlWas();

    // Zusaetzliche Aussage der Giraffe
    System.out.println("Ich schaue von oben auf alle herab.");
  }

  // Methode aus Tier ueberschrieben
  public void geraeuschMachen() {
    System.out.println("MAMPF");
  }

  // Diese Methode ist ueberladen, weil die Menge und Art der Parameter geaendert wurde
  public void initialisieren(String neuerName, int neuesAlter, float neuesGewicht, String neuesUrsprungsland, boolean neuGefaehrlich) {
    // deshalb kann man hier auch ohne super arbeiten
    initialisieren("Giraffe", neuerName, neuesAlter, neuesGewicht, neuesUrsprungsland, neuGefaehrlich);
  }
}
